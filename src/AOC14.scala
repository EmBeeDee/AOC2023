package net.snowtiger.aoc

/**
 * @author mark
 */

object AOC14
{
	val input = "O....#....\nO.OO#....#\n.....##...\nOO.#O....O\n.O.....O#.\nO.#..O.#.#\n..O..#O..O\n.......O..\n#....###..\n#OO..#...."
	val input1 = "...O..O.O.O.#.OO....#..O.O#.#O...#.OO.##.#...O#...#.##........##.#O#..#......#.OO......#.....O.#..O.\n..OO...O.##.#...O.....OO#.O..O......O#...........#.O.#..#.###O....O..........#...O..#..#....O..#OO.O\n.#OO.......#.#....O..O.#......#...#O......#...O.OO..........O..O.#.O.OO.O#OO.O....#..O#..O..O.....#.\nOO..O#..OO.....#..OO..#..OOO#..O......O.##..O#....OOO.##........O.#.O....#..O.O...#....#..O#..#.O.##\n#O.O.....O.#.#.#.#.#......O#..O..O.#...O..O.O.O...O.O.O.OOO.....O...O..O...###O.OOO...#..OO..O#O#...\n.......O...OO.O.O.OO.OO..O....#O...O.#O........##.O...#....#O...#.....O..OO.O.##...O#####.OO.O....#.\n##.....O#...O..O....OO....OO#.O....O.#..O.#.O.....OO......OO...OO#....#.........#.....#..O.O....O...\nO#.#.OO........O....#.O...O.##..###.#.O.#......#.....O.....O#...#.#O..O....O##O#..O..O#.#..#.....O..\nO..O#....#...O#......OO.#...#OOOO...O..O...O###O.O###.....#....#O#O#OOO....O.#....OO..O....O...##.O.\n.......O#O..........#...OOO..OO##..O...O#...#O.O..O..O...#O.....O#O.#........OO.#OO....#O.O.#.O...O#\n.#.#.....O.#.O.#.##..#O.....#O.##O....O#O.O#.....#...O..##O............O.O#.#....O....O.O.........O.\n....O#..O#.#.O.........OO..O#O..#.....#.#..O..O....#.#...OO......#...#..#..O##O..O.#...........O#..#\n...O..........O..#O#..OO#.#...OO.O.O#.O.OO..#........#..OO..O.OO.....#.#O....O.O#O.OO.#...O.#O...O..\n..O..OO..#O..O#..O..O#.#..OO...O.O...#.O..O.......O...OOO.........OO..O......#..#..O...O..O##.#OO...\n........OO.O.O...O..##...O##...O..O..O.OO..O.#.#.....#.O.O.O.....O.##...O#O..#......##.#...O.O...O..\nOO#..............#...O.......#.O.....O..##.......O.O##....#O..#.O...#O#.O.##.O#....#...O..O..#....O.\n..#.O...#.....O...O..#.##O..O....O.O.....O..O........O...#O...#..O...O....O..O....#.O..O.O......#...\n...OO.O...#..#...O.OO#......O..O.O.#..#..........###..#.#.......#.O..#.O......OO.#.O#..O..O.O..#..O.\n...#.......O##O..#O...#.#.#..#..#...#.....OOO#.O#O#.....O......OO....#.#.OO....O.O.##O..O....O#O.#.O\n##O#.OO.O#....O.#..O..O..##...O..#O.O...........#O.##....#...O....#OO.OO....O....#OO#O.......O......\n#O..#.....O....O.O#O..O.O.O....O.O#.OOO...#.#.O.OOO#.O#....#.OO#.###.....#...O#O.#.....OO..O.....O.O\n##..#....#.O.#.#...OO.O.....#.#.#.###......##.....O....#...O##OO.O.OO.OO##.O.......#..O##.....OOO.#O\n......O.#..OO..O......#OO....O..O...O....O.....OO......##.#.OO....O.....O..O..O.#.#..#..OO#.O..OO...\n....##...O.O.O.O.O..O..#O..#........#.O..O...#.O.....###.O..O.#..O......O##....O.....O.#.....#....OO\n#....#..........#.......O.O#.........#.#..O......O..O#.O..O.##.##..O..#OO.O#...............O#.#O....\n..##..O#O.#......O#..#....#.O...O...O.O.O#....##.#...O..O#......#.O#.#.......O#O...#.##..#..OO..O...\n...O.#..O.....OO##.....OO.#......O.OO..#.O##.#....O#.O.#....#..O#.O.#...#........#.#.#O..O...#O..#..\n...##..........O#.#......O.......OOO...O..............O.O##........#........O.....O....#O#.#.....#O.\n.#......O...O..#...#..#.O#.....O..OO#O...O.....##.#.#......OO..O##......#...O.O....O..##...O....#O..\n..#O.O...#..O..OO.#..OO...##...#..O#O....O...O.....#O#..#.O.......O........#OO..O....#.#O.........#O\n.#.....O.##...#....O..O..#.O.#.#OO...#........#..O.#.#....#.O..O.#O.#..#.......#..............##.O.#\n...O..#...#.O....O.O#.#...#.#...........O.O..#.#..O.......#O.OOO.#.....#.O.#...#O....#O.O.......##..\n.#....OOOO..O.....O.OO#O..#...#.....O....O...#..##.O..O.#..O..#.O#..O.O...O#.....OO........O..OO#..O\nO.#.O.#...#O...#O.#......#O...O.#.O.O#O#..#.........##.O.OO..#....OOO##...O##.##.#.O...#.O.#O#......\nO..##..O...O#OO#O..O..O...###..OOO...#O#......##..O.........O#.....O..#...#O......#.#..O....O......O\n........#O#..##O....OO..#..#.#...#.#.#...OO...O###.#O.#OO.#..#.O.......O..O..O..OO...O....O..#...#..\n.....O...O....#.#.O#...O..O.#.#O.OO#OO.O.#.....#.#..#..O.#O....##......O##O##.O#..O.###....O#O.O.#..\n..##....#.O.#.#O#.O..O....OO#O..O....#....#.O.O.#...#OO....#O.#..#O.......O.O.O.#.....#O..O.O......#\n.O..#..........#..O.#..#.#..O..O.O#..#..O..#.....O#..#..#OO...O#.O..OOO.....O..O..OOO..#..O..#....O.\n.....O..#.#..#......OO...#..O.#..##....#O..O.O.O..O.#..OOO..O.OO......###..#..O#.OO####..#..OO.#....\n#.#...O.....O....#O..#..##.O.#...O.#.##.OO...#..#O.O...#.....#...O.O.O...O.#.#..#..O.....O..OO.O..OO\n..#O..O.O...O##O.O..#..O.##O##..O.OOO#O...O....#.O#............OO.#.O..#...........O......O.#..##...\n.....O.O...#O.O...O#....#..#...O.#..OOO.O.OO.O##..#...#..O#O#..O..##...#....OO........#..O.O.#...#O#\nO#..O....O.#...#...#...O#.#..OO#.#..O...O.OO....O...#.#O.###.#...##..OO..##....O.OO...OOO.O.#.......\nO.O.#.........#####..O..#.OO..O.OOO...#O#..O.............OOO...O.....#..OO...O......#O....OO...OO.O.\n#.O#...O##.O.#.........#.#.#..O......#.#....O...OOO.O...#....#.O#....O.....O.....#.O..#..#.#O.......\n#..O......#.......O#O.OO#......#...#.....O#..O.O.#.....O..#.#.....##...#...O...#.#.O..O.O.....O...#.\n.OOO.O...#O.#..O#O...#..#O#..#.......###...#.#......#O###.....#...#....###O#.O....##O...#.#...O..#..\n.O...OO.......O.O#O#.O.#O.O...O....OO#.....#..#.....O....OO.#......O#OO...O##.#..#.#..O..O...#...#..\n...O....O..O#O....#.........###..O.....O...O#....O#.....#.#.....#.O.#.OO..#.O###.....#O#...#.OO#....\n#.#.....O#O....O......O#..##OO......O#..#O.O#..#...O.O##OO#.......O...#...OO.....#.O.....O#O#.....#.\n..OO##.#..OO#O.......O.O..OO#..O....O#.O.O.#.#..#........O.....#...........#O.......O.#.#.......#.O.\n.##O.....O....#...O..O.OOO.O.OO..#.#..O.........#...##..#..O#....#..O..#O....O......#O..O#..#O..#O..\n#O.......O#......O.......O.O.#.......OO....#.....#O.#......O#OO...O.....O......O...#..O........#.OO.\nO....#...OO.O..O......#O.O...#.OOO.OO....#....O.O#..O#..#...O.O...O..#O....#O...O..OO........#O.O.#O\n#O#..O.........#......#OO..O#.OO#O##..#.O...O#.....#..#O#..OO.#.O#....O.O..##O#O..#O......#.O.OO.O.O\n...##.....#..........#..O.O#....#..O...O......##.O.....#.OO#..OO...O..#..#O#..#.O.#..O#O..#......#..\n#OO.O##..##O...#..O.O#OO#OO....##.#...O.#.#.#.#O#....O.......O.....#..#.O.#.#...........#........O..\n#....O..#O#O............O#O..O.......O#.O.O##..###.#.O#O.#O....O............O..O....#.....O.OOOO....\n.OO.OO..#O....#O....O.O..OOO..#..O..OO.....O...#.O.#.O.O.............O..#.O....O##..OO#.O.O.#O..O.#O\n.....O......O...#.#....#.....OO...O....#O...#.#.O..##......O...O#.....O.O...#.......................\nO..........#O...O#.OO..O.O.#.......#...............#....O...#.O.O..#..O....O....#...#O#.O....O.#....\n#..O....O...O#..#OO.O....OO.#..O.O.O.O......O.O.....O....#..O#..O.OO....#..#.#...#......#...O#..O.OO\n.......#..O....O.O........#O#OO.#O.O.OO....#..O.....O.#....O...#O.#.O.O.O....##..OO.#O..O#.......#.O\n....O....O.O.##O..O..OO####O....O..O.........O.#...OO...#..#..#...#......#......O..#...O.....##...O.\n.#OO#..O..O...O.OO....O.O....OO#..#O.O....O..OOO..##..................O....#....O..O...O......#.OO.O\n.#.........O#.O#...#...O##.....O.OO.O.##O...O.#.##...OO.....##....#..O.OO#..O....#.#...O...O..OO....\n.#.O...OO.OO.O.O#...#.#O.........#O..OO#O#.#.......#..O##....O#..#...#O......O.......O.....#..O..#..\n.##..OO....O.....#O.....O..#..#O#..#......#..O.........O.........O#O..........#OOOO.......#.###.#.#O\n.O..O..O...OO...OO......O.O..O.#O...#O#.O#..O#......#.O#O.......#..O##.O.O....OO#.O......##OO#.#...O\n..#.O..#......#..#O.OO..O...#....O.##......#....O.O.O.....O.#...##....##....OO.O#.....O....O..#....#\nO..#.OOO......O.O.OO...O......O.#.#OO.#.....##....#.##..O.....#.....O....#...OO....O#.#.#.........#.\n.O......#O.......O..#.##...#.#.O....O.##..O#.OO.O.O#.#O#..##..O..##.O#O.O...#.OO.#.O..#.O.#.O.#.#O.O\n.O..O.O..O.O...............OO...O.O.#..#...#.....#..O#.O.OO#.O......##O...O.....O.O.#.#..O..O.O.O.#.\nO.........#...O#.O....O...O......#O..##..#O.O.#O..O..OO...#..#.#.#O.........O..OO..O.O.O#.O......#..\nOO...........#.....O.O.#.#...O..#.#.#O.#.O#...#O.....O.OO.O..##.....##OO.........O...#OO#O...O....O.\n.#.......O.#OO.#OO.O#.OOO...#..##.OO..O...OO.......O.#..OO.O.O..#...O...O.....O.##OOO#..O.....O.O.#O\nO#.O.O.OO...#..O.....O#......#..O#OOO.OO#..O...O...O.#..O..#.O..#O.OO##...##.#.#O.#O.O.....##O..O#.#\nO.#.#........#...O...#...O.O.O.#.O.....O.......#....#O..OO.#.......#.O...#.O.#..#...#O.###...#.....O\n........OOO...O.OO.##O.O..#.O...O..#.......#OO#OO..O##O.......##.........O...OO.......#...#..O#O.#O#\n..O#OOO.O#..##........O.......O.....#.O....OOO..O......#.......OO.......#..#.#.#.#....O#...#.O.....#\n....O....#..#..O.O.O.O..O........O#....#..#.O..#OO.....OOOO....O#.O......#O..OOO#.O..#....#...O...OO\nO#...O#......O...#..#......#.........O.#........#.O#.#...###.#O.O....#O.....#...#.##....O..##...OO..\n....O....O........##.O.....#....O.....#..#........#OO.O.#OOO....#..#.#...###......O.O..#....OO......\n.O#O....#OO#OOO.#.....O.O......##....#..OO.OOO.O##..#O.#.#...#.#....O..O#...O..OO.#.O...O..##...#...\n.O#OO#..O.#OO.......##O#O.#.O..#.O#OO.OO.O.#.O#........#...O.#.O.O##O.........OO..O...O.O.O.....O#..\n..##....###.O#.....O....OOO.O.....OO...O....OOOO.#........#.....#.#..O.#.....#...OOO.....OOO..#.O..#\n.OO##.#.#....O..#..#.#..O.#..O.OO....O.O..O.OO.O.O.....#..#.............OOOO.O....O.O.O.#..#.......O\n#.O.#.O#O.O.O.O.#.#......O#O..OO..O.....#....O..#..#O.............#....#OO....O##...#..O....O...#..O\n....#...##...#...#....#.O.O#....#O.O.##.#.O...O#...O#....#.......O.#.#.....O....#.#O.O..O...O..O..#.\n.O.##.#...O#OO.....O.........#O.O.O#..........OO.O...#..#.OO....O..#..#...O...OO......O##O.....O#O..\nO#...........O....#O...O...O#..#.....#OO...OO..OO#OO..O.#.O#.OOO...O.....O..O...O...O.#O#.#O.....O..\nO.OO.O.OOO.O##.#..OO....#....#O.#...O...OO..OO..O#O.....#...O...O...........O....#.O....O.O..#O#..##\n#..#......O..OO#.......O..#......#O##....O...O.#.O#.#.O..#.#O..O..O#..O.O.#.OOO...OOO.#.#O.#....#.#.\nO##..O......#OOO.#..O.O#.#...O...#...O...#O..OO..#.##O.......#O.#..#...#.O.....#.O.O.#..#.O.O..O...#\n.#OOO.....O...#.......OOO.O.#.O.O#.#..#O.#....#O.#....#......#.O...OO..O..O..#O.##.OOO........O.O#..\n...O.OO.O....#O...#...#OOO..O...#....OO....O...#..#O...#.#OO......O......O#.O#....#..#OOO.#....O.#..\n..#.OOO....#.O..#.O#.#O...O.O.......#..OO.##.#.#..O..O....O#.#.....#..##.#O.......O#O##OO.O......OOO\n..O.#...##O##O.O#...O.O#.#O.#...O........#.OO.O...##...O..O..##..O...O.#.....O...#O.#O#O.O......O.#O\n..O.#..O.#.....O...#OO##..O.OOO...O.##O..O.O.......#.....O..O.##......O.....O#.........#.........O.#"

	def main(args: Array[String]): Unit =
	{
		val lines = input1.split("\\\n")
		val grid = Grid(lines.map(_.toArray).toArray)
		grid.print()
		val finalLoad = cycleUntil(1000000000L, grid)
		//val (n, g) = cycleUntil(1000L, grid)
		println(finalLoad)
		//g.print()
	}

	def cycleUntil(max: Long, grid: Grid): Int = {
		var seen = Map[String, Int]()
		var loads = Map[Int, Int]()
		var g = grid
		var c = 0
		var s = g.toString
		while (c<max && !seen.contains(s)){
			seen+= s->c
			loads+= c->g.northLoad
			c+= 1
			g.cycle()
			s = g.toString
		}
		val prev = seen(s)
		val len = c-prev
		val n = prev + (max-c)%len
		val load = loads(n.toInt)
		println(s"$n $load $c $prev")
		load
	}

	

	case class Point(x: Int, y: Int)

	case class Grid(g: Array[Array[Char]]) {
		val h = g.size
		val w = g(0).size

		override def toString = g.map(_.mkString).mkString

		def print() = {
			g.foreach(l => println(l.mkString))
			println()
		}

		def cycle(): Unit = {
			rollNorth()
			rollWest()
			rollSouth()
			rollEast()
			println(northLoad)
		}

		def rollNorth() {
			val stops = Array.fill(w)(0)
			for (y <- 0 until h) {
				for (x <- 0 until w) {
					val c = g(y)(x)
					val stopY = stops(x)
					if (c=='#') stops(x) = y+1
					else if (c=='O') {
						if (stopY<y) swap(Point(x,y), Point(x,stopY))
						stops(x)+= 1
					}
				}
			}
		}

		def rollSouth() {
			val stops = Array.fill(w)(h-1)
			for (y <- h-1 to 0 by -1) {
				for (x <- 0 until w) {
					val c = g(y)(x)
					val stopY = stops(x)
					if (c=='#') stops(x) = y-1
					else if (c=='O') {
						if (stopY>y) swap(Point(x,y), Point(x,stopY))
						stops(x)-= 1
					}
				}
			}
		}

		def rollWest() {
			val stops = Array.fill(h)(0)
			for (x <- 0 until w) {
				for (y <- 0 until h) {
					val c = g(y)(x)
					val stopX = stops(y)
					if (c=='#') stops(y) = x+1
					else if (c=='O') {
						if (stopX<x) swap(Point(x,y), Point(stopX,y))
						stops(y)+= 1
					}
				}
			}
		}

		def rollEast() {
			val stops = Array.fill(h)(w-1)
			for (x <- w-1 to 0 by -1) {
				for (y <- 0 until h) {
					val c = g(y)(x)
					val stopX = stops(y)
					if (c=='#') stops(y) = x-1
					else if (c=='O') {
						if (stopX>x) swap(Point(x,y), Point(stopX,y))
						stops(y)-= 1
					}
				}
			}
		}

		def northLoad: Int = {
			g.zipWithIndex.map(p => (h-p._2)*p._1.filter(_=='O').size).sum
		}

		def swap(p1: Point, p2: Point): Unit = {
			val c1 = g(p1.y)(p1.x)
			g(p1.y)(p1.x) = g(p2.y)(p2.x)
			g(p2.y)(p2.x) = c1
		}

		def transpose: Grid = Grid(g.transpose)
	}

	def tokens(s: String): List[String] = s.split(' ').toList.map(_.trim).filter(_.size>0)


}