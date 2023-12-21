package net.snowtiger.aoc

import scala.collection.mutable

/**
 * @author mark
 */

object AOC21
{
	val input = "...................................................................................................................................\n......#.....#.........#.....#.#...#.##.......#.#........#..#..................#.#...........#............#.#....##..#........#.....\n...#.......#....#.#......#..#.......#.....#................................#...#......#.......................#...#........#.......\n....#..#...#......................#............#........................#.#.............#.#....#........#...........#.#......##.#..\n.......#.....#.......#.....#.........#....#...#......................................#...#.##....#.....................#...#.......\n..#....................................#..........##..............#........#...#.........###................#........#....#...#..#.\n....#.....................#.....#.#............#.#.................#.............#...........#..#..........##.............#........\n..#..#...#..............##.........#...........#......#.........#.................................#...#.......#.#..#...............\n..#....#..#...#.#.#.......##......#.#..#.....##.#................................###..#....#................#...........#..#....#..\n..#......#...........#..........#..................#........#......#.#.............................#..#..............#...#.....#...\n.............##.#............#....#.#....#.#.##.................#..#...#.......#.................#....#............#...#...........\n.............##...............#...#.#..###....##..................#.................#..............#....#.#.......#..#.#........#..\n..................................#...##.#.................#....................................##..................#.##.#.....#.#.\n...#............#.....#....#.......#.#........#.........#..##..#....................###........................#....#........#.....\n.................#.#......#.......#..#...#.#.......................#..#.............###...##.#...#...#.#..#...#....................\n.................#..#..#.#........#.....#.............#.#...........#.......#.........#............................#....#.#........\n....#.......#.....#....#.#..#....#...#..#............#.##.........#...#.....#........#...............#.................#.##....#...\n..#....................##...#......###.................#....#.........#...............................#....##..........#........#..\n...#.....#........#.....#.#.........#.##................#.#...#....#.#...#...#.................#...........#....#.#...#.....#....#.\n..#...###.....#.......#......#..........#................................................#.......#.#.........#...#.................\n......##...##...............#...##....................#.............#....................#........#.#..........................#.#.\n...#.......#..##...#.....................................#..##......#.#..#........................#.#...................#....#.....\n.....#...#...................#.....#.#..........#......#.......#....#....#..#...#..........#.....#...............#.................\n..#.#...................#..#....................#....#..#......#....###.......#........................#.##.......#.......#.....#..\n.#....#......#..#..#..............#................##...........#........#...#.#...............#.#....#....................#.......\n.....#.....#..#............#......................#.........#...#...................................#...........###.......#......#.\n.#.......................#...#................#....................#.............#..............#...#.#......#........#........#.#.\n.....#.#.#.#......#..............#..............#.........#...........#.##.##...........#............#.............#...#....#.#....\n.............#......#..........#.....................#...............#...........#..........................##....##...............\n..#............#.........#...............#..##.#.......#....#.......###...............#.......................#..##..#...#.#...#...\n..#...#....#.......................................#.................#.##..##....#..................##..........#.#.........#......\n.#.......#..................###........#......#............#.................#...#.##..#....................#..................#...\n.......#....#..........#.#...........#...#.#.....#....##.##..#.#...........##......#.#.................#....................#......\n..#..#...#.........#....#.............#...#.#.....##..............##........#.#.......................#..............#...#....#.#..\n.....................#..................#..####..........................#.#.....#...#...................................###...#...\n..#.#....#........#......#..........#..................#...#...#..........#.##...........#....###.............#...........#....#...\n.#.................#.....#...........#....#....#.....#....#.....#..##.#.............#.......#................#......#..............\n...........#..##....##.......................#..#....#...#..............#.....#...##...#..#...#..............................#.....\n.##...#..........#...#..........#......#.........#.#...............##............#......#..#.......#...........#.#.........#.......\n..............#........................#......#...............#..........#.#...#.....##........................#........#...#......\n..#.............#..............#....#....##..#...............#.#..........#....##.#.............................#........#......##.\n.......................................#........#..........#..........#..#.#........#..............#..........#.......#.........#..\n....#.......#.....#...............#....#..........#......##.........#.##.##..........##.##..#........#..................#...#......\n...........................#................#............#...#...................#..###................#...........#.#.............\n...#.#.......#.................##.#.........#..#.#............##.......#..................#..........#..#.................#.#..##..\n......................................#.............#.......#.....#..#.........................#....#.....#..........#.............\n......#..#...##..............#.....#.............#.........#.#.................#...#...#......#...#..................#...#....#....\n..............................#.....#....#...#.#......#..............#..........#.#...........##..........##...............###.....\n.....#.............................#................#.#...#.........#............#.......#......#...#....#.................#.#.....\n........#............##......#..........#............................#.....#..................#...#.#.####.................#.......\n.......#.###...............##...##.......##........#...............#.............#.#.............#......#..#...........#......#.#..\n.#...#..#.#...............#..#.....#.........................#.......................#.....#.....#......#.................#...##...\n......#................................#.......#...................................................................................\n.#..#...#.......#.....#............#.#..#....#............#.............#..#.......#.#....#....#..#.....#........#.........#.......\n..#.................#....##..#........#..........#.....#...#...#............#..#...#.......#....#.....#..#.....#...........#.......\n......#...................#.##............#................#...#..#.#......#......................##......#.....#..................\n........................#..#.........#.......#...........#...#.........##..##......................#........#.#..##..............#.\n............#.#..#.....#.#.#.....#.....#......#...#..........................#..#............#.................#..#.#.........#....\n............#.#..#..............................#...........##...........#...#...........#...........#.#..#....#.#.................\n..#.......#.....#...............##.....#..........................#............#.#.##.....##....#....#......#....####............#.\n...................................#.....#..#.#.#.........#....#..........................##....#.#.#.....#...........#............\n...........#...............................................#.#..................#........#......#.......#...#..#....#..#...........\n...........#.#........#....#.##.#..#.#.#....#..#.#.............#.................#...#.#...........#............#......#...........\n...........#....##..##........##.......#..........#..........###....###..##...........#.#.........#.#...#..........................\n.....#...#...##...#......#.........#..#.................#...............................#...............#....#.............##......\n.................................................................S.................................................................\n..............##....##.##...........#............#.#..#.....#..........#..#..#..#...##....#..................#......#......#.......\n........#...........#...........#.#...#...#...........#...#...##...##..#......#.........#...#..#........#.......#..#....#..........\n............#.#....#...##......#......#.........#...#.#..............#..#.#.........#.....#....#........#..........................\n...........#...##..........#..##...#..#..........#...#..##..#.....#...............#.#............#.#.#..........#....##............\n................#.......#.............#..#.........#.#...#...##.............##.........#......................#........#...........\n.#................#.#................##...#....##.................#......#..#.#........#.........#.....#.#..#...##......#..........\n............#...........#..#.....#....##..#.................................#...#.....#...#....#...##.....#......#...##.........##.\n...#.....................#......#....##.......................#....#.#...............#........#..#......#............#.............\n...#.#........#.....................#...........#..#.....#......#....#......##......................#..#..#..#.##..#.........#..#..\n................#................#..#........#............##.#...................................#..#..............................\n.................#..............#......................##............#......#..#..#...#.....................#..#.#.#.............#.\n.#...#..#..............#.#.......#........#..#..........#......#...#....#.#....#.........#......#.....##......................#....\n....#..#...........#.#..............#.........#..##.................#.#....#..........#..#.........##..........#............##..#..\n..#.#.#............#.........#..#......##.....##..#...............#........#...........#...................#..#..................#.\n....#....................#.##.....#...#......##.#.............#......#....#.........................#.........#....................\n.....#......................#.#..#......#.......#.....#.............#.....#.............#.#.........#.#......#.............#.......\n...#.#..#.................#.....#...........#........#....#...#........##.........#...#.....#..#.....#..#.#..................#.....\n...##..#.##.#...........#.....................................#...............#...................##......#.#.........#......#..#..\n....#..................#...#....#............#............#...#............#..#.........#...............#.#.........#..............\n...........#..............#........#........#.#....................#..#....#..............................#........................\n..#....#.#..#..#..........#.#.##..#..#..##....#.#..#....................#............#....#...#..................#...#......#......\n.....####......#.#...............#.....#...........................#......#.............#.......#.............................#....\n.....#.........................#............#.#......##.....##.........##...........###.....#......##.##.............#......#.#....\n....#...............................##...#......#...#.......#................#...#..............#..............###.................\n..........#.#.#......#.......#...##.....#....#.............#..##.........................#.........#..................#............\n...........#.#......#.........#.......#.#..............#.#...........#................#...................................##.......\n.#.....................................#.....#........#.#..#..........#...#..........#.#.......###..........#....#..#.#....#.#.....\n.....#.....#.....................#..#.......#....#....###.#.#........##.........#.............##..#..............#....#......#.#...\n.....#..#..###.#..#................#...##.......#.....#......##.............####.....#....#.............................#..........\n....#.##.........##.......#.......#.......#.#.........##................##...#................#.........#......#.#.#......#........\n.#.....#.............................#..............#...........#.#........#......#..#...................#.#.........#...#.........\n..........#.###..#.....................#.......#...........#............##.........##.........#........#.........#......#....###...\n........#....##.##........#..................#....##.#...#.........#......#...#............#...................#..#.............#..\n.#..#.............................................#..................................#......................#...#............##.#..\n........................#.....#.............#.....#..........#..#.......#...#...#..##..............#..........#...#............#.#.\n.....#....#...#....#..#........................#....##.......#.#...#....###............#.#............#.........#..................\n......#......#...#..#.......#...............##...#...........#..........#.........#...#...............##................#........#.\n.................#.##...#.#...............#.......#..........#..#.........#...#..###.............#.........#.........##............\n..#....#.........................#.#........#.#...........#..........#....#............#.................##....#...................\n...........#....#.............#.....................#.....###.......#...#...#...#.......................#..#.##.......#.......#....\n.#.............#....#....#........#...........#.......................#......#..................#..#.....#.#..#..#........##.......\n.#.....#.....##...#........#.........#...............#.#..........#...#...#...........................##..##...#....#.......#......\n....#..#......#.....#.###..#.##.......................###.....................#................##..................................\n.................#.#.....##..##.......#.#........#........#........##........#....#..........#.....#......#.............#........#.\n....................#.......#..#....................#..#........#.#.........................................#.##...................\n.....#....#....#.......#....#....#........#................#....#....#........#............................#......#.#......#..#....\n.............##....#...#................#..........#...........#...#....#.....##........#.#..#.......#..#....#....#..#.#.....##....\n.......#......#..#...#....#..#.........#...............#...#.#..........................#.#.....#.....#.#.............#............\n.....#................#..........#.#.##.#.#...............................#........................#.##..........#.........##.#.#..\n.....#........#.....##...........#...#........................##........#.............#......#.................##..................\n.........................#.....#.......#.#..#..#..........#.#..#........#.##......................#....................#...#.#.....\n...........#..#.###........#...........#....#..#........#.......#.......#...........................#....#.....#..#....##...#......\n....#..............................#.......................#.......#.#.......................#.......#..#.........#..............#.\n......#.#......#..#..#...#.......#..............##.....................................#.............###.....#.......#..#.#......#.\n.....#..#..............#.........#........#..#....................#..#.........#.........#.....#....#.....#......#.................\n...#...........##...#.......##.#...#...#.....#...................................#.......#......###.....##............#..##........\n.....#...........#................#....#...#...#.##..............................#.......#..#.........#.....#..#.....#..#...#...#..\n...#..............#.....##.......#.....#.......................................##.......##.....#...................###.....#.......\n......#..##..#...#........#.............##..#.......#.........................#.#..........#..............#......................#.\n...............#.........#..##..........#...#.#...#.#.#....................#.....................#...#..##....#....#..#.........#..\n.........#....#..#........#............................#....................#.#.........#.........................#...........#.#..\n......#....................##......#....##................................#.....#...#...............#............#...#..#.#.....#..\n......#.#.....#.........#.....................................................#......#................#............#..........#....\n...............#..#......#....#............#..........##...#............#..................##......................................\n..................................................................................................................................."
	val input1 = "...........\n.....###.#.\n.###.##..#.\n..#.#...#..\n....#.#....\n.##..S####.\n.##..#...#.\n.......##..\n.##.#.####.\n.##..##.##.\n..........."

	def main(args: Array[String]): Unit =
	{
		val lines = input1.split("\\\n")
		val grid = Grid(lines.map(_.toVector).toVector)
		grid.print()

		val t = System.currentTimeMillis()
		val steps = 500
		val n = grid.findPlots(steps)
		val centred = grid.centreS
		centred.print()
		centred.printTopVisited(steps)
		val n2 = centred.findPlotsInf(steps)
		println(n)
		println(n2)
		println((System.currentTimeMillis()-t)+"ms")
	}

	case class Point(x: Int, y: Int) {
		def abs = Point(x.abs, y.abs)
		def neg = Point(-x, -y)
		def reflect = Point(y, x)
		def add(p: Point) = Point(x+p.x, y+p.y)
		def scale(n: Int) = Point(x*n, y*n)

		override def toString: String = s"($x,$y)"
	}

	case class Grid(g: Vector[Vector[Char]]) {
		val h = g.size
		val w = g(0).size
		val start = {
			val y = g.indexWhere(_.contains('S'))
			val x = g(y).indexOf('S')
			Point(x,y)
		}

		def print() = {
			g.foreach(l => println(l.mkString))
			println(s"Size $w by $h")
			println("Non-rock = "+g.map(_.count(_!='#')).sum)
			println()
		}

		def replaceS(line: Vector[Char]) = line.map(c=> if(c=='S') '.' else c)

		def makeEvenSize = {
			var newGrid = g
			if (w%2==1) newGrid = newGrid.map(x => x++replaceS(x))
			if (h%2==1) newGrid = newGrid++newGrid.map(replaceS)
			Grid(newGrid)
		}

		def triple: Grid = {
			val gWide = g.map(line => replaceS(line)++line++replaceS(line))
			Grid(gWide++gWide++gWide)
		}

		def horizEdge(y: Int, fromX: Int, untilX: Int, visited: Map[Point,Int]): Map[Int,Int] =
			visited.filter(p=> p._1.y==y && p._1.x>=fromX && p._1.x<untilX).map(p => (p._1.x-fromX)->p._2)

		def vertEdge(x: Int, fromY: Int, untilY: Int, visited: Map[Point,Int]): Map[Int,Int] =
			visited.filter(p=> p._1.x==x && p._1.y>=fromY && p._1.y<untilY).map(p => (p._1.y-fromY)->p._2)

		def centreS: Grid = {
			def centre[T](v: Vector[T], x: Int): Vector[T] = {
				val h = v.size/2
				if (x<h) v.slice(x+h+1,v.size)++v.slice(0,x+h+1)
				else v.slice(x-h,v.size)++v.slice(0,x-h)
			}
			Grid(centre(g.map(centre(_, start.x)), start.y))
		}

		def inside(p: Point) = p.x>=0 && p.x<w && p.y>=0 && p.y<h
		def get(p: Point) = g(p.y)(p.x)
		def good(p: Point) = get(p)!='#'
		def wrap(p: Point) = Point(Math.floorMod(p.x,w), Math.floorMod(p.y,h))

		val allDirs = List(Point(1,0), Point(0,1), Point(0,-1), Point(-1,0))

		def visitPlots(total: Int): Map[Point,Int] = {
			var visited = Map[Point,Int]()
			var toVisit = Set(start)
			var n = 0
			while (n<total && toVisit.nonEmpty) {
				n+= 1
				var newPoints = Set[Point]()
				for (p <- toVisit) {
					for (d <- allDirs) {
						val newP = p.add(d)
						if (!visited.contains(newP)){
							if (inside(newP) && good(newP)) {
								visited+= newP -> n
								newPoints+= newP
							}
						} else if (visited(newP)>n) {
							visited+= newP -> n
						}
					}
				}
				toVisit = newPoints
			}
			visited
		}

		def printTopVisited(total: Int) = {
			println(visitPlots(total).filter(_._1.y==0).toList.sortBy(_._1.x).map(_._2))
		}

		def findPlots(total: Int): Int = visitPlots(total).filter(_._2%2==total%2).size

		def findPlotsInf(total: Int): BigInt = {
			val visited9 = triple.visitPlots(total)
			val topEdge = horizEdge(0, w, w*2, visited9)
			val bottomEdge = horizEdge(h-1, w, w*2, visited9)
			val leftEdge = vertEdge(0, h, h*2, visited9)
			val rightEdge = vertEdge(w-1, h, h*2, visited9)
			val visited1 = visitPlots(total)
			
			val manhattan = w+h
			var c = BigInt(0)
			for (y <- 0 until h)
				for (x <- 0 until w)
					visited.get(Point(x,y)).foreach(n => {

						c+= (total-n+manhattan)/manhattan
					})
			c
		}

		def transpose: Grid = Grid(g.transpose)
	}

	def tokens(s: String): List[String] = s.split(' ').toList.map(_.trim).filter(_.size>0)


}