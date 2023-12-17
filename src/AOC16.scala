package net.snowtiger.aoc

/**
 * @author mark
 */

object AOC16
{
	val input = ".|...\\....\n|.-.\\.....\n.....|-...\n........|.\n..........\n.........\\\n..../.\\\\..\n.-.-/..|..\n.|....-|.\\\n..//.|...."
	val input1 = "\\.............\\................\\....\\..../....\\/...............................\\...-..........-.\\.-....../....\n|\\......../|....\\..............-\\............./...........................-..........-......\\........\\........\n.......||......../....-./.../-...|.|..-......-.|....../................\\............|...................-..|..\n........./......-.............-\\......................|.\\./.......|........./......-......../..-.........|....\n....../....................-............................................../...../...|.........................\n....................\\....|/............................./.......-....|......../..........................\\....\n.|....../|.........-......|.............\\..|..................|......../.................|.|............-.|...\n.....-............\\\\............\\................/......-.........\\................\\..|../....................\n............|..|.......|......../................\\.......................|../....../......./.....|............\n.\\...........\\..\\.............../.........-/....|......................./.....-./-.........../-........-......\n|................\\.\\-.............../..-............./........./.................\\.............|...-.....-....\n.........-....|..|......................................\\.||...-../..|............../...../.../.........-.....\n.....-....-\\.................|...........|../.....\\...............................|...../../|.................\n.\\......\\......................\\....../.../.....-.../.........................../..|...........|..\\...........\n-............|.........-.-........-.........................|...\\...-...........\\.|...-....../..........|.....\n.........-.......|......\\.....\\..-...../..../.....\\.../............/..........-......./....../...........\\.../\n..............\\........................|.............................-../......-..-...../..................\\..\n.....\\......-.......-.......-......../../../........\\.......-..........|......./........................../...\n.\\...\\...................|./\\|.-..\\...............................\\..\\.....-....|......................./.....\n.................-...|....|.../...../.|.||.....-.|............................-..............\\................\n........................................../.......................|........\\......../.../..............|.....\\\n.......\\......./............................./........../../..........................-\\..................|...\n...........-...|..\\..........-.........\\.................././................|./.......|............../.......\n......./..................................\\...-.........\\........\\....../............................\\......\\-\n-.|..-|...............|..........................\\..........|.-.........\\............-.|.............\\.....|..\n.............................../..............-.....-.......-........................|.......-................\n.........\\.........-.........|...../......../......./....-...\\...................\\........\\...................\n..........\\.........\\........../...|.................|./...\\.......\\..........-...............................\n./...................|........../\\......../....................|..-...........\\...\\...........|..............|\n.....|...........\\-.\\.......-..........................-....-...................|....|.|...............-......\n.|.././......................|.......|.......|..............\\...../.................../.\\...-.................\n...........-........./....|.................|..-.....-............./...................................-..../.\n...................\\/..|.....-............../-......-..........|........................./...\\....-|....|-....\n........................./..-..|.\\-...............-......-/...../.......\\..|................-...\\.|.....\\.....\n\\...../.........................../....................-..........|........../..-..-.......\\........../.././|.\n........................../...\\|..................................................../...|.-........-.....|..\\.\n....\\.............................|./.....|...../....\\.............\\...../.......-...............\\..-..../....\n.........-.........................|................|........\\/.\\-...................\\..-......./../..........\n...-.../............/.................-..........\\....../............../...../..........|.....................\n..........\\...\\..................|...-......\\\\......./...-.............-\\.................|...../......\\......\n/..\\/.............\\....\\.............\\.......................................|.....\\....-............\\........\n....../..\\.|................................\\.........../.......-.......-/.....|...................-.....-....\n........-....|.............................|....../...............\\.......................--..................\n................/......|.........-....................-..............|.......................................|\n.........\\........|...........................\\.............|.............................../.................\n...|..\\....-......../.\\...-............................................................/....-...../...........\n.............\\\\\\.../...../.../..........\\..............\\...........\\........................|....../.........\\\n......-..............|..-..|....-\\..\\..-...-............\\.................\\...-.\\/.....\\......-.\\....--.../...\n........./...................../...../..|...\\.\\/.........\\.../........................................\\.../-..\n........\\.......|.......|\\..|........../..../\\........../........\\..../..............././..../.............-.\\\n........................|-............|............................./.-.|...|............../....-\\............\n../........-.../....................|....................-/.............../.....-...........-....\\......||....\n.....\\..|.....-|../....|./....-|.......-...../..-..\\..............\\...................../.................|...\n...-......../.\\...........\\.........\\../.....|............\\..................../.........\\................/.\\/\n...../...|............-..\\.../............/............-..............--.-..........././............-........|\n.....|...........\\.....-...\\..../.....-........-.....\\.|..............\\....-............./...../..............\n....\\.....-.|....\\..../..............\\|../.........../......|....\\/.......................|............|....-.\n........|..--..............|..............-........|.......|.-.........\\.............-...........\\............\n./.||....\\......./....\\./........../...........././....\\.................../..................\\...../.........\n.......|..\\...-.\\..\\..|.........../..................................-....|........\\......|....|..............\n...|..........|.........-...............|...............................-.......|...........-..\\.......\\......\n.\\.........../../............................-..|...\\.....-.........../......-|.../.....|.................-...\n........|....../..\\..\\|..|......|.........|...............................\\../.....\\....-/........-...........\n.................................................\\.......|........|.\\.-....../.......|.......|............\\...\n.......|.......\\.......|.........|......-......|...|...\\.............\\.............|/.........................\n..........|....................|..........\\..........-......./................................................\n...../.......|....................|......................././.................................................\n........\\.............|........--..........\\.............../......|...................../............|..\\.....\n....-............|.........|....|.-.\\../-...\\....-...-................\\|..\\-.......|........-............../..\n................/........\\.....\\.....././....|....................-...............\\...........-......\\........\n.\\.....|......|...|\\......\\.\\/....\\.............-............\\.....\\.......-...-........-....//..../.....|..-.\n..................|..|.-.................../\\...........|..../..........\\|.....-..|.../.......................\n-......-......./........./../.............../..................-..\\.......\\............|...../../....../......\n....../............/...........\\.............\\............./.........../.......\\......|....|.........../......\n...\\........|..................|............-............-.....-..\\..-................/........../........||..\n......../..|..-../..../......................../.........\\./.-................../...................-.........\n.../....|....\\.......-..\\..........-....\\.............|\\........../...............-........|..................\n..............\\.............\\|.........-......................-........\\|......./.......-.................|...\n/..../...-||\\-...|\\...............................\\.......................\\.............-................-....\n.......-..-....|..................|..............................................................///...-.../.|\n......|.......-/........-.-......|....\\..-...|...........\\...........\\.....................-..../.........../.\n......-...........|-..\\.......|...|.\\|.................-....\\...................\\.\\........\\.\\./.........\\....\n....../............../.........|...|.......|..../.............................................................\n.........../...................-./...\\..........\\-............./...........\\.../.....|......................-.\n/..../..../........................................|.\\......-/......./....\\.........................-......|..\n.\\./.|.-..........................|...|...........|....../....-....../|...............\\..............\\...-....\n....|...\\..........|......-..................|........../..|.-...\\........./........|................|........\n...\\....\\........../........../.........\\..............-...........................-.|...../..........\\.......\n...|...........-...........................\\........-.........................\\...-..-.....\\.......|........-.\n......\\|...........................\\.....................................-............/....\\...........|......\n................../............-........................\\.................................................-...\n.../....|...............|....................../\\.........|....................\\....|............\\.........|-.\n.......................................|....-.........../....\\-........|......./............-..|.............\\\n/.........\\..\\.........|...............\\.......\\........./................\\....................|.....|........\n..................................|.....|.-..|.../......................../-\\......|..........................\n.................|.....................................................-............|.....|..../.\\/..........|\n.......\\....\\....-........|.|..../......-......\\...../....................-...........\\............-..........\n....-.................................-..........-......-................................../.........-\\...|...\n.....................|......................|.........-............../.../.....-........\\.....................\n.\\./..........-.\\...\\||................./../........\\.........|...\\........\\....\\.\\...............-|......|...\n..\\......//.........../.\\........\\......|......|........\\......\\.....-..........|.-..|...../|.................\n/.....................\\.................-........|...................\\.....-..............-/.....\\..|../../...\n...|..-.../............./.|.................../............/..\\...........-....|-............\\.......--.......\n..............\\..\\/.....\\.........|.\\.........................|............|........./................./-..|-.\n...........................-.................../...................|\\..........\\/..|.-........................\n.....-.............................../....................\\.........|......................|..................\n..................\\.........../...........\\..\\/.........|...........|..-........|....\\..........-...../.|.....\n..........|.......\\..\\...........\\.../......................-...........-.....-........../\\|..................\n....../.......-........................\\|...//...\\..-......\\.......|..\\....................-..........\\..-....\n|./....|........-./........../.\\...\\.....|../..../.......-........../.\\.....-................................."

	def main(args: Array[String]): Unit =
	{
		val lines = input1.split("\\\n")
		val grid = Grid(lines.map(_.toArray))
		grid.print()
		val n = grid.nEnergised(Point(0,0), Point(1,0))
		println(n)
		println(grid.allStarts)
		val t = System.currentTimeMillis()
		val max = grid.allStarts.map(p => Grid(lines.map(_.toArray)).nEnergised(p._1, p._2)).max
		println(max+" "+(System.currentTimeMillis()-t))
	}

	case class Point(x: Int, y: Int) {
		def abs = Point(x.abs, y.abs)
		def neg = Point(-x, -y)
		def reflect = Point(y, x)
		def add(p: Point) = Point(x+p.x, y+p.y)
		def scale(n: Int) = Point(x*n, y*n)
	}

	case class Grid(g: Array[Array[Char]]) {
		val h = g.size
		val w = g(0).size
		val a = Array.fill(h)(Array.fill(w)(Set[Point]()))

		override def toString = g.map(_.mkString).mkString

		def print() = {
			g.foreach(l => println(l.mkString))
			println()
		}

		def printEnergised() = {
			a.foreach(l => println(l.map(s=> if (s.isEmpty) '.' else '#').mkString))
			println()
		}

		def nEnergised(from: Point, dir: Point) = {
			fill(from, dir)
			a.map(_.count(_.nonEmpty)).sum
		}

		def inBounds(p: Point) = p.x>=0 && p.x<w && p.y>=0 && p.y<h

		val allDirs = List(Point(0,1), Point(1,0), Point(0,-1), Point(-1,0))

		def allStarts: List[(Point,Point)] = {
			def edge(corner: Point, dir: Point, n: Int) =
				(0 until n).map(i=> (corner.add(dir.scale(i)), dir.reflect)).toList
			edge(Point(0,0), Point(0,1), h)++
				edge(Point(0,0), Point(1,0), w) ++
				edge(Point(w-1,h-1), Point(0,-1), h) ++
				edge(Point(w-1,h-1), Point(-1,0), w)
		}

		def fill(p: Point, dir: Point): Unit = {
			if (inBounds(p)) {
				val s = a(p.y)(p.x)
				if (!s(dir))
				{
					a(p.y)(p.x) = s + dir
					val newDirs = g(p.y)(p.x) match
					{
						case '|' => split(dir, Point(0, 1))
						case '-' => split(dir, Point(1, 0))
						case '/' => List(dir.reflect.neg)
						case '\\' => List(dir.reflect)
						case _ => List(dir)
					}
					newDirs.foreach(d => fill(p.add(d), d))
				}
			}
		}

		def split(dir: Point, split: Point): List[Point] = {
			if (dir.abs==split.abs) List(dir)
			else List(split, split.neg)
		}

		def transpose: Grid = Grid(g.transpose)
	}

	def tokens(s: String): List[String] = s.split(' ').toList.map(_.trim).filter(_.size>0)


}