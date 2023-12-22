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
		val lines = input.split("\\\n")
		val grid = Grid(lines.map(_.toVector).toVector)
		grid.print()

		val t = System.currentTimeMillis()
		val steps = 26501365
		val n = grid.findPlots(steps)
		val centred = grid.centreS
		centred.print()
		// This expansion required for the test data, because it doesn't have clear lines from the S tile!
		//val n2 = centred.expand(5).findPlotsInf2(steps)
		val n2 = centred.findPlotsInf2(steps)
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
		def inside(topLeft: Point, botRight: Point) = x>=topLeft.x && x<botRight.x && y>=topLeft.y && y<botRight.y

		override def toString: String = s"($x,$y)"
	}

	case class Grid(g: Vector[Vector[Char]]) {
		val h = g.size
		val w = g(0).size
		val start = {
			val y = g.indexWhere(_.contains('S'))
			val x = g(y).indexOf('S')
			Point(x, y)
		}

		def print() = {
			g.foreach(l => println(l.mkString))
			println(s"Size $w by $h")
			println("Non-rock = " + g.map(_.count(_ != '#')).sum)
			println()
		}

		def replaceS(line: Vector[Char]) = line.map(c => if (c == 'S') '.' else c)

		def makeEvenSize = {
			var newGrid = g
			if (w % 2 == 1) newGrid = newGrid.map(x => x ++ replaceS(x))
			if (h % 2 == 1) newGrid = newGrid ++ newGrid.map(replaceS)
			Grid(newGrid)
		}

		/* Adds n copies of the grid all around it; for n=1 we get 3x3 the original, n=2 gives 5x5, etc */
		def expand(n: Int): Grid = {
			def scale[T](v: Vector[T], by: Int): Vector[T] = (0 until by).toVector.flatMap(i => v)

			val gNoStart = g.map(line => replaceS(line))
			val gWide = gNoStart.map(scale(_, 2 * n + 1))
			val middle = g.map(line => {
				val noStart = replaceS(line)
				scale(noStart, n) ++ line ++ scale(noStart, n)
			})
			Grid(scale(gWide, n) ++ middle ++ scale(gWide, n))
		}

		def centreS: Grid = {
			def centre[T](v: Vector[T], x: Int): Vector[T] = {
				val h = v.size / 2
				if (x < h) v.slice(x + h + 1, v.size) ++ v.slice(0, x + h + 1)
				else v.slice(x - h, v.size) ++ v.slice(0, x - h)
			}

			Grid(centre(g.map(centre(_, start.x)), start.y))
		}

		def moveToOrigin(p: Point): Grid = {
			def move[T](v: Vector[T], x: Int) = v.slice(x, v.size) ++ v.slice(0, x)

			Grid(move(g.map(move(_, start.x)), start.y))
		}

		def inside(p: Point) = p.x >= 0 && p.x < w && p.y >= 0 && p.y < h

		def get(p: Point) = g(p.y)(p.x)

		def good(p: Point) = get(p) != '#'

		def wrap(p: Point) = Point(Math.floorMod(p.x, w), Math.floorMod(p.y, h))

		val allDirs = List(Point(1, 0), Point(0, 1), Point(0, -1), Point(-1, 0))

		def visitPlots(total: Int): Map[Point, Int] = {
			var visited = Map[Point, Int]()
			var toVisit = Set(start)
			var n = 0
			while (n < total && toVisit.nonEmpty) {
				n += 1
				var newPoints = Set[Point]()
				for (p <- toVisit) {
					for (d <- allDirs) {
						val newP = p.add(d)
						if (!visited.contains(newP)) {
							if (inside(newP) && good(newP)) {
								visited += newP -> n
								newPoints += newP
							}
						}
					}
				}
				toVisit = newPoints
			}
			visited
		}

		def findPlots(total: Int): Int = visitPlots(total).filter(_._2 % 2 == total % 2).size

		def findPlotsInf(total: Int): BigInt = {
			val g9 = expand(1)
			g9.print()
			val visited9 = g9.visitPlots(total+2*(w+h))
			var c = BigInt(0)
			val maxBx = (total+w/2+1)/w
			val maxBy = (total+h/2+1)/h
			val centre = visited9.filter(_._1.inside(Point(w,h),Point(w*2,h*2)))
			//println(visited9.filter(_._2<=total).filter(_._2%2==total%2).size)
			for (by <- -maxBy to maxBy)
				for (bx <- -maxBx to maxBx) {
					if (bx==0 && by==0)
						c+= centre.filter(_._2<=total).filter(_._2%2==total%2).size
					else {
						val b0x = bx.signum*w
						val b0y = by.signum*h
						for (p0 <- centre.keys) {
							val px = p0.x+b0x
							val py = p0.y+b0y
							var steps = visited9(Point(px,py))
							steps+= w*(bx-bx.signum).abs
							steps+= h*(by-by.signum).abs
							if (steps<=total && steps%2==total%2) {
								println(s"$px,$py $steps ${visited9(Point(px,py))}")
								c+= 1
							}
						}
					}
				}
			c
		}

		def findPlotsInf2(total: Int): BigInt = {
			val g9 = expand(1)
			//g9.print()
			val visited9 = g9.visitPlots(total+2*g9.w)
			val max = (total+w/2)/w
			val centre = visited9.filter(_._1.inside(Point(w,h),Point(w*2,h*2)))

			def onLine(base: Int): Long = {
				var k = max.toLong
				var d = base+(k-1)*w
				while (d>total || d%2!=total%2) {
					k-= 1
					d = base+(k-1)*w
				}
				(k+1)/2
			}
			def quadrant(base: Int): Long = {
				var k = max.toLong
				var d = base+(k-1)*w
				while (d>total || d%2!=total%2) {
					k-= 1
					d = base+(k-1)*w
				}
				(k+1)/2 * (k/2+1)
			}

			def countUp(fn: (Point,Int)=>Long): BigInt = {
				var c = BigInt(0)
				centre.foreach(v=> c+= fn(v._1,v._2))
				println("Counted "+c)
				c
			}

			val middle = countUp((p:Point,n:Int)=> if (n<=total && n%2==total%2) 1 else 0)
			val right = countUp((p:Point,n:Int)=> onLine(visited9(p.add(Point(w,0)))))
			val down = countUp((p:Point,n:Int)=> onLine(visited9(p.add(Point(0,h)))))
			val left = countUp((p:Point,n:Int)=> onLine(visited9(p.add(Point(-w,0)))))
			val up = countUp((p:Point,n:Int)=> onLine(visited9(p.add(Point(0,-h)))))
			val br = countUp((p:Point,n:Int)=> quadrant(visited9(p.add(Point(w,h)))))
			val bl = countUp((p:Point,n:Int)=> quadrant(visited9(p.add(Point(-w,h)))))
			val tl = countUp((p:Point,n:Int)=> quadrant(visited9(p.add(Point(-w,-h)))))
			val tr = countUp((p:Point,n:Int)=> quadrant(visited9(p.add(Point(w,-h)))))
			middle+right+down+left+up+br+bl+tl+tr
		}

		def transpose: Grid = Grid(g.transpose)
	}

	def tokens(s: String): List[String] = s.split(' ').toList.map(_.trim).filter(_.size>0)


}