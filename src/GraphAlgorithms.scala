package net.snowtiger.aoc

import scala.collection.mutable

/**
 * @author mark
 */

object GraphAlgorithms {

  case class Graph(nodes: List[Node]) {
    lazy val edges = nodes.flatMap(n=> n.links.map(l => (n,l._1)))
  }

  trait Node {
    /** The nodes that can be reached from this one, together with the cost (distance) of the link */
    def links: List[(Node,Int)]
    /** Should return true for the node (or nodes) which are the goal state of the search. */
    def isGoal: Boolean
    /** Can be overridden with an "admissable" remaining-distance heuristic to use A* instead of plain Dijkstra  */
    def aStarHeuristic = 0
  }

  case class ScoredNode(node: Node, pathDistance: Int) extends Ordered[ScoredNode] {
    /** For A* the score is the distance travelled to this node, plus the heuristic for what we think is left */
    def score = pathDistance+node.aStarHeuristic
    override def compare(that: ScoredNode): Int = that.score.compareTo(score)
  }

  /** Actually just Dijkstra unless you have overridden Node.aStarHeuristic to be > 0 */
  def aStar(start: Node): (Int,List[Node]) = {
    var visited = Map[Node,Node]()
    def recoverPath(from: Node): List[Node] = if (from==start) Nil else from::recoverPath(visited(from))
    val queue = mutable.PriorityQueue[ScoredNode]()
    visited+= (start->start)
    queue+= ScoredNode(start, 0)
    while (queue.nonEmpty) {
      val curr = queue.dequeue()
      if (curr.node.isGoal)
        return (curr.pathDistance, recoverPath(curr.node).reverse)
      else {
        val links = curr.node.links
        for ((next, dist) <- links)
          if (!visited.contains(next)) {
            visited += next -> curr.node
            queue += ScoredNode(next, curr.pathDistance + dist)
          }
      }
    }
    throw new Exception("No path found!")
  }

}