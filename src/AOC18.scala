package net.snowtiger.aoc

import net.snowtiger.aoc.AOC18.{Command, Point, dirs}

import scala.collection.mutable

/**
 * @author mark
 */

object AOC18
{
	val input = "R 6 (#70c710)\nD 5 (#0dc571)\nL 2 (#5713f0)\nD 2 (#d2c081)\nR 2 (#59c680)\nD 2 (#411b91)\nL 5 (#8ceee2)\nU 2 (#caa173)\nL 1 (#1b58a2)\nU 2 (#caa171)\nR 2 (#7807d2)\nU 3 (#a77fa3)\nL 2 (#015232)\nU 2 (#7a21e3)"
	val input1 = "L 7 (#1dc5f0)\nU 6 (#4497e3)\nL 3 (#3b21c0)\nU 3 (#3d8523)\nL 9 (#58e7b2)\nU 8 (#35d213)\nL 10 (#329390)\nD 3 (#1302b3)\nR 7 (#07f802)\nD 8 (#38fbd3)\nL 7 (#6d0e72)\nD 6 (#2c2493)\nL 5 (#38b7d0)\nU 6 (#2ab7b3)\nL 2 (#0ce560)\nU 6 (#2ab7b1)\nL 2 (#2f6940)\nU 2 (#2a5a83)\nL 3 (#477150)\nD 11 (#0baea3)\nL 4 (#3899c0)\nD 3 (#34a803)\nL 5 (#55c0d0)\nU 9 (#328483)\nL 2 (#460290)\nU 5 (#48cfd3)\nL 4 (#1e3150)\nU 5 (#3b7ea3)\nL 7 (#2c0a10)\nU 11 (#51d803)\nL 4 (#39fe80)\nU 3 (#51d801)\nR 10 (#2938e0)\nU 2 (#1c17f3)\nR 4 (#0df9a0)\nU 3 (#579691)\nL 8 (#354a50)\nU 4 (#3d0131)\nL 6 (#1029b0)\nU 7 (#0c19b3)\nL 3 (#5f48c0)\nU 2 (#0c19b1)\nL 4 (#15ff10)\nD 9 (#0f08b1)\nL 5 (#1c8160)\nU 9 (#573b71)\nL 6 (#2d58e0)\nU 3 (#479121)\nL 4 (#1c7bb0)\nU 8 (#34d583)\nL 10 (#416f10)\nD 5 (#34d581)\nL 7 (#59af90)\nU 5 (#24a821)\nL 9 (#196ca2)\nU 6 (#1f89d3)\nL 4 (#6b4812)\nU 2 (#1f89d1)\nL 6 (#32e5a2)\nU 8 (#5eb4c1)\nR 7 (#5bffe0)\nU 10 (#3f8051)\nR 8 (#29ac30)\nU 4 (#495a21)\nR 7 (#3b4e10)\nU 2 (#52d3a1)\nR 7 (#1e27d0)\nU 4 (#09ad83)\nR 8 (#385530)\nU 4 (#218943)\nR 3 (#0d8de0)\nU 3 (#218941)\nR 3 (#3ac220)\nU 12 (#09ad81)\nR 3 (#08aa80)\nU 5 (#33c7b3)\nR 2 (#37a350)\nU 3 (#6808c3)\nR 11 (#355310)\nU 3 (#6808c1)\nR 3 (#14fbe0)\nU 6 (#47b293)\nR 6 (#28ab80)\nU 3 (#37d873)\nR 4 (#607702)\nU 2 (#3d77a3)\nR 4 (#18a432)\nU 3 (#26ee23)\nR 10 (#0ba7e0)\nU 3 (#0b2863)\nR 7 (#604a60)\nU 7 (#477053)\nR 2 (#0a1210)\nU 4 (#2f7e63)\nR 9 (#0316e0)\nD 5 (#1372d3)\nR 10 (#382a30)\nD 3 (#2da293)\nR 3 (#100920)\nD 7 (#5267e3)\nR 2 (#66c240)\nD 4 (#1c94a3)\nL 5 (#2d7770)\nU 5 (#2c0061)\nL 7 (#4181c2)\nD 5 (#1f97c1)\nL 3 (#4181c0)\nD 4 (#2b79b1)\nR 9 (#1bcaf0)\nD 4 (#04de93)\nR 2 (#010a22)\nD 4 (#599823)\nR 3 (#010a20)\nU 6 (#189b23)\nR 4 (#38f770)\nU 9 (#452e51)\nR 3 (#2551f0)\nU 6 (#333c81)\nR 6 (#0554d0)\nU 5 (#411e13)\nL 4 (#487840)\nU 10 (#411e11)\nR 4 (#2c69e0)\nU 7 (#13c311)\nL 6 (#164330)\nU 4 (#7449a1)\nR 10 (#467570)\nU 5 (#47fcc1)\nR 2 (#13e090)\nU 5 (#2e45a3)\nR 4 (#0f97a0)\nU 9 (#129b03)\nR 3 (#46c520)\nD 9 (#11dcf3)\nR 4 (#0d0e42)\nD 4 (#05ca31)\nR 4 (#56d742)\nD 2 (#05ca33)\nR 6 (#1e5ae2)\nD 3 (#56bbb3)\nR 9 (#1ce6b2)\nD 5 (#039d83)\nR 2 (#3f1c90)\nD 4 (#198063)\nL 11 (#3cf8a0)\nD 7 (#198061)\nL 3 (#2311e0)\nD 4 (#401ab3)\nL 7 (#46c522)\nD 5 (#2d4703)\nR 6 (#0f97a2)\nD 7 (#053643)\nR 6 (#603110)\nD 12 (#2ab333)\nR 2 (#25d970)\nD 3 (#1956d3)\nR 5 (#528eb0)\nD 2 (#3a55e3)\nR 5 (#1aa8d0)\nU 5 (#29e981)\nL 5 (#133d80)\nU 8 (#559581)\nR 5 (#133d82)\nU 4 (#298e61)\nR 3 (#0ed762)\nD 5 (#481221)\nR 4 (#0ed760)\nD 9 (#3a5a61)\nR 4 (#265580)\nD 3 (#241031)\nR 3 (#2bacb0)\nD 10 (#4e8481)\nR 4 (#4f2bc0)\nD 10 (#47fcc3)\nL 3 (#15d6f0)\nD 9 (#6a0e71)\nL 5 (#3cc390)\nD 4 (#2fa353)\nL 4 (#272140)\nU 5 (#029653)\nL 3 (#428820)\nU 8 (#23f923)\nL 4 (#036c82)\nD 4 (#3315f3)\nL 7 (#663ce2)\nD 2 (#09be53)\nL 8 (#075c00)\nD 5 (#552f63)\nL 5 (#662630)\nD 2 (#3e3fb1)\nL 9 (#543310)\nD 5 (#2b6db3)\nR 8 (#06d960)\nD 2 (#2b6db1)\nR 3 (#570160)\nD 6 (#441a91)\nR 6 (#2f24e2)\nD 11 (#2ca451)\nR 7 (#5700c0)\nD 5 (#36e6f1)\nR 3 (#5700c2)\nD 8 (#374141)\nR 5 (#2b1072)\nU 11 (#489e23)\nR 5 (#456682)\nD 4 (#522e63)\nR 3 (#127202)\nD 7 (#65dc21)\nR 8 (#489d40)\nD 3 (#686b21)\nL 4 (#107ca2)\nD 7 (#2271a3)\nR 4 (#148da2)\nD 3 (#34bf71)\nR 2 (#70b522)\nD 9 (#34bf73)\nR 8 (#49a172)\nD 6 (#2271a1)\nR 3 (#138232)\nU 4 (#3e4511)\nR 4 (#0bb2b0)\nU 8 (#2958d1)\nR 5 (#1df330)\nU 3 (#23af43)\nL 5 (#4bbaa0)\nU 7 (#23af41)\nL 4 (#125270)\nU 9 (#41ec91)\nR 2 (#222ff0)\nU 5 (#2936d1)\nR 8 (#2e2310)\nD 5 (#2e05a1)\nR 3 (#0ae0c0)\nD 11 (#074021)\nR 7 (#52f6e0)\nU 2 (#074023)\nR 3 (#590720)\nU 6 (#469f01)\nR 3 (#34f792)\nU 7 (#002dd1)\nR 4 (#409522)\nD 3 (#002dd3)\nR 6 (#149f72)\nD 5 (#1cc8f1)\nR 5 (#095222)\nD 7 (#3eab71)\nR 3 (#236082)\nD 11 (#3b3d71)\nR 2 (#6e2530)\nD 3 (#0887f1)\nL 6 (#1795d0)\nU 7 (#21f2d3)\nL 6 (#194240)\nD 7 (#2e0d03)\nL 3 (#605a50)\nD 4 (#257243)\nL 8 (#0a5380)\nD 7 (#2b70c3)\nL 4 (#428fd0)\nD 8 (#5b1513)\nL 6 (#1bf3f0)\nD 3 (#341241)\nL 3 (#1f7ea0)\nD 8 (#2eda01)\nR 6 (#527980)\nD 7 (#62ec43)\nR 10 (#156e00)\nD 5 (#53ce33)\nR 4 (#3a5f20)\nD 3 (#2f3bb3)\nR 6 (#5dacd0)\nU 4 (#47f0e1)\nR 6 (#538c70)\nU 4 (#32a283)\nR 8 (#27c140)\nD 9 (#198283)\nR 6 (#1b5ba0)\nU 9 (#15de53)\nR 4 (#037d60)\nU 7 (#373ac3)\nR 7 (#282640)\nU 7 (#33c993)\nR 6 (#2f6bc0)\nU 4 (#236a23)\nR 5 (#4977b0)\nD 4 (#076301)\nR 6 (#56dc60)\nU 3 (#30afb1)\nR 2 (#720272)\nU 8 (#2b0fc1)\nR 7 (#19ac60)\nU 7 (#07ff61)\nR 3 (#585610)\nU 2 (#4969b1)\nR 7 (#56dc62)\nU 5 (#029821)\nR 9 (#60a4e0)\nU 8 (#1688a3)\nL 4 (#19a5b0)\nU 3 (#20db03)\nL 7 (#1a7950)\nU 6 (#1ab903)\nL 8 (#463660)\nU 2 (#449963)\nL 3 (#11ec80)\nD 4 (#206da3)\nL 8 (#1057b0)\nD 6 (#17ffa1)\nL 8 (#6cda70)\nD 4 (#26df51)\nL 3 (#001d70)\nU 9 (#3e42f1)\nL 5 (#55e962)\nU 5 (#138341)\nL 6 (#0c3e52)\nU 9 (#4ae8f1)\nR 8 (#0ad032)\nU 7 (#14e3b1)\nR 4 (#5a3b70)\nD 7 (#1dad81)\nR 11 (#3d8e92)\nU 6 (#441b61)\nL 6 (#20de92)\nU 10 (#55efb1)\nL 6 (#1d72c2)\nU 10 (#1469a1)\nL 6 (#21f4b0)\nU 4 (#49b921)\nL 2 (#560f10)\nU 10 (#49b923)\nL 3 (#03dc20)\nD 6 (#249e01)\nL 7 (#6859d0)\nD 4 (#0947e1)\nL 3 (#5d3fd2)\nD 11 (#2c3801)\nL 6 (#26cab2)\nD 4 (#1f5b51)\nR 13 (#0fcc92)\nD 3 (#638131)\nL 7 (#404362)\nD 2 (#6cc863)\nL 6 (#1d8d62)\nD 4 (#161423)\nL 6 (#595612)\nU 7 (#09d071)\nL 4 (#10a5d0)\nU 4 (#633011)\nL 8 (#3cddf0)\nU 3 (#3a8471)\nL 7 (#407050)\nU 7 (#00b9a1)\nL 3 (#2537e0)\nU 2 (#00b9a3)\nL 5 (#3a9220)\nU 5 (#212a31)\nL 7 (#572a62)\nU 5 (#0b0ea3)\nL 4 (#52f702)\nU 6 (#0b0ea1)\nR 6 (#077262)\nU 9 (#116db1)\nR 7 (#688352)\nU 8 (#37c5e3)\nR 7 (#23b522)\nU 3 (#37c5e1)\nR 6 (#4a4aa2)\nU 9 (#57bf21)\nR 4 (#60ae60)\nU 3 (#06dc81)\nR 3 (#47d900)\nD 4 (#587561)\nR 6 (#2940e0)\nD 8 (#1268d1)\nR 5 (#0ec482)\nD 6 (#38b6c1)\nR 6 (#59c532)\nD 8 (#2e4421)\nR 6 (#0b8022)\nU 5 (#410a61)\nR 2 (#7409d0)\nU 6 (#28e351)\nR 8 (#15d2e0)\nD 4 (#12ab01)\nR 5 (#100f80)\nD 6 (#44c953)\nR 4 (#33eef0)\nU 6 (#23c7d3)\nR 5 (#4696e0)\nU 4 (#222123)\nR 9 (#26d070)\nU 9 (#4cec13)\nR 2 (#560af2)\nU 6 (#5099a3)\nL 11 (#4b4b52)\nU 4 (#10b4e3)\nL 8 (#40e6b0)\nU 6 (#1c6173)\nL 5 (#2e31e0)\nD 6 (#3d8c01)\nL 7 (#1cc6f0)\nU 9 (#083731)\nL 4 (#463da0)\nU 8 (#1cb711)\nR 8 (#0b4110)\nU 8 (#2252b3)\nR 10 (#60b900)\nU 7 (#2252b1)\nR 8 (#0ce680)\nU 5 (#467f81)\nR 9 (#0ad0b2)\nU 2 (#359203)\nR 9 (#67bc02)\nU 9 (#359201)\nR 4 (#0653e2)\nD 3 (#281ca1)\nR 9 (#1b8ee0)\nD 6 (#0b3861)\nL 8 (#336f02)\nD 3 (#3201f1)\nL 4 (#4a85a2)\nD 7 (#111eb1)\nL 9 (#1c9c90)\nD 7 (#145011)\nL 11 (#083be0)\nD 2 (#516321)\nL 6 (#083be2)\nD 9 (#20bb21)\nR 5 (#3d8030)\nD 6 (#404031)\nR 8 (#642420)\nU 4 (#56cf61)\nR 7 (#55c610)\nD 4 (#20d1e1)\nR 9 (#1b5e10)\nD 9 (#1e85d1)\nR 9 (#361f10)\nD 3 (#3d69f1)\nR 9 (#16da12)\nD 6 (#2d6471)\nR 5 (#5d9642)\nD 3 (#4656f1)\nR 6 (#44b540)\nD 8 (#2b6131)\nR 7 (#2ce630)\nD 7 (#2b6133)\nR 3 (#61b2a0)\nD 4 (#4c2661)\nR 4 (#3b7372)\nD 8 (#01ed73)\nR 5 (#4c3962)\nD 3 (#01ed71)\nR 4 (#4ba142)\nU 9 (#4377f1)\nR 3 (#1deb32)\nU 6 (#3f3323)\nR 3 (#22b722)\nU 7 (#37bc13)\nR 3 (#1918d2)\nU 4 (#13c8b3)\nR 5 (#1918d0)\nD 12 (#3e4d83)\nR 3 (#22b720)\nD 5 (#0cefe3)\nR 5 (#2bf9f2)\nD 9 (#3122d3)\nR 8 (#41a3e2)\nD 10 (#3122d1)\nR 8 (#0b6e02)\nU 7 (#266641)\nL 4 (#5a1cc2)\nU 5 (#060d11)\nR 4 (#32ff32)\nU 7 (#446c91)\nR 5 (#319c82)\nD 3 (#446c93)\nR 7 (#1bf562)\nD 2 (#44af13)\nR 6 (#6f3132)\nD 6 (#312433)\nL 5 (#489da0)\nD 5 (#53a343)\nL 8 (#489da2)\nD 3 (#5a6673)\nR 7 (#0f0f92)\nD 6 (#01b8b3)\nL 3 (#3c6b12)\nD 5 (#725613)\nL 10 (#114b12)\nD 4 (#14ace3)\nL 8 (#30d292)\nD 9 (#1ebac3)\nL 6 (#3c4292)\nD 7 (#39e2a3)\nL 2 (#1f3882)\nD 4 (#658381)\nL 3 (#0b0252)\nD 8 (#699e71)\nL 10 (#2b4ae2)\nD 2 (#1ac903)\nL 5 (#60cef2)\nD 4 (#515ea3)\nL 5 (#4d3790)\nD 6 (#354183)\nL 4 (#398170)\nU 3 (#7163a3)\nL 10 (#398172)\nU 7 (#0608f3)\nL 8 (#4d3792)\nD 4 (#06c7a3)\nL 7 (#5819c2)\nD 5 (#17c3f1)\nL 3 (#0c8892)\nD 5 (#67f951)\nR 6 (#3ff470)\nD 12 (#397601)\nR 6 (#3ff472)\nD 4 (#4f6451)\nL 9 (#665a22)\nD 2 (#1705c1)\nL 3 (#14df92)\nD 7 (#4b40a1)\nL 4 (#1fa1f2)\nD 5 (#3b7231)\nL 10 (#063e12)\nD 7 (#2a8fb1)\nL 4 (#6b71e2)\nU 4 (#218101)\nL 4 (#2e2f52)\nU 4 (#221411)\nL 5 (#200732)\nU 5 (#0ac7e1)\nL 9 (#50af62)\nD 9 (#4b7c81)\nL 3 (#50af60)\nD 4 (#2b9d31)\nL 13 (#4766d2)\nD 5 (#25ef21)\nR 3 (#119862)\nD 2 (#517a31)\nR 4 (#3e6072)\nD 10 (#21cfa1)\nR 6 (#4437f2)\nU 12 (#30f031)\nR 4 (#036652)\nD 7 (#453c91)\nR 5 (#05ea22)\nD 10 (#2da1e1)\nR 2 (#4da5a2)\nD 2 (#2da1e3)\nR 6 (#2bffc2)\nD 9 (#453c93)\nR 9 (#4ed2d2)\nD 3 (#141b71)\nR 9 (#3ecad2)\nD 5 (#234873)\nL 11 (#3c4982)\nD 3 (#2ed113)\nL 7 (#3c4980)\nD 7 (#4a6553)\nL 8 (#49bf02)\nD 8 (#337011)\nL 9 (#2eb772)\nD 3 (#690ec1)\nL 2 (#25f0a2)\nD 7 (#62eeb3)\nL 6 (#1ae012)\nD 7 (#34e643)\nR 6 (#382a72)\nD 7 (#281183)\nL 11 (#271932)\nD 4 (#470d23)\nL 9 (#4ca812)\nD 4 (#6f1ea1)\nL 7 (#4702f2)\nD 8 (#34e641)\nL 4 (#155c42)\nD 10 (#62eeb1)\nL 7 (#3a2422)\nD 4 (#3f7ca3)\nL 9 (#39b860)\nU 4 (#5cf1c3)\nL 13 (#39b862)\nU 4 (#4751f3)\nL 4 (#322dd2)\nU 4 (#539531)\nL 5 (#4171a2)\nU 5 (#539533)\nR 9 (#075042)\nD 5 (#1e57d3)\nR 7 (#5cc952)\nU 5 (#0ac0d3)\nR 6 (#1af522)\nU 9 (#374273)\nL 4 (#2992f2)\nU 2 (#299893)\nL 4 (#267bc2)\nU 10 (#47af63)\nL 3 (#282402)\nU 4 (#06a063)\nL 5 (#5cce72)\nU 9 (#47fba3)\nL 3 (#1168e2)\nU 10 (#3b1071)\nL 4 (#178c22)\nU 3 (#42b971)\nL 5 (#178c20)\nU 8 (#1dca41)\nR 9 (#442912)\nU 8 (#5b9241)\nL 3 (#1da682)\nU 7 (#31ff23)\nL 10 (#3cd732)\nU 5 (#33bab3)\nL 5 (#159fb2)\nU 4 (#2e5d93)\nL 7 (#5f9702)\nU 4 (#5566e3)\nL 4 (#0ba292)\nU 8 (#07f963)\nL 3 (#410a02)\nU 3 (#6ace93)\nL 5 (#0913a2)\nU 2 (#21a553)\nL 10 (#3d71a2)\nD 6 (#25ff63)\nL 5 (#5285b2)\nD 8 (#3cfc73)\nL 3 (#13aba2)\nD 7 (#24a793)\nL 4 (#29e4c2)\nD 12 (#1dc4b3)\nL 5 (#3cb102)\nD 8 (#5b8433)\nL 5 (#3cb100)\nD 7 (#22d9f3)\nL 7 (#6db9c2)\nD 6 (#4cd683)\nL 6 (#083f42)\nU 11 (#09bbc3)\nL 5 (#609002)\nD 7 (#12b603)\nL 7 (#041be2)\nD 8 (#4f3823)\nL 5 (#5a3412)\nU 7 (#14de13)\nL 6 (#036ee2)\nU 5 (#442823)\nL 7 (#6c5502)\nU 3 (#2edcc3)\nL 9 (#3b6b72)\nU 8 (#321e73)\nR 7 (#48e5a2)\nU 6 (#2fbec3)\nL 12 (#44ed12)\nU 6 (#0c1893)\nR 12 (#61a8e0)\nU 4 (#073043)\nR 4 (#0d47c0)\nD 6 (#469b63)\nR 2 (#047ae0)\nD 10 (#39b7d3)\nR 3 (#2492d0)\nU 8 (#2026f3)\nR 3 (#73fb40)\nU 2 (#201333)\nR 3 (#372f72)\nU 2 (#2c6143)\nR 10 (#615ea2)\nU 4 (#355653)\nR 7 (#3876d2)\nU 9 (#080463)\nL 8 (#3af4b2)\nU 10 (#6840e3)\nL 3 (#5472d2)\nU 9 (#005683)"

	def main(args: Array[String]): Unit =
	{
		val cmds = input1.split("\\\n").map(extract2).toList
		val lines = genLines(cmds)
		val image = Image(lines)

		/*
		val edge = genEdges(cmds)
		val grid = genGrid(edge)
		grid.print()
		 */

		val t = System.currentTimeMillis()
		/*
		grid.fill()
		grid.print()
		println(grid.nFilled)
		println()
		 */
		println(image.fill)
		println((System.currentTimeMillis()-t)+"ms")
	}

	def extract1(line: String): Command = {
		val s"$d $n (#$rgb)" = line
		Command(d(0), n.toInt, rgb)
	}

	def extract2(line: String): Command = {
		val s"$d $n (#$rgb)" = line
		val dirs = "RDLU"
		Command(dirs(rgb.last.asDigit), Integer.parseInt(rgb.take(5),16), n)
	}

	val start = Point(0,0)
	def genLines(cmds: List[Command]): List[Line] = {
		var p = start
		var lines = List[Line]()
		for (cmd<-cmds) {
			val line = cmd.genLine(p)
			lines = line::lines
			p = line.end
		}
		lines.reverse
	}
	def genEdges(cmds: List[Command]): List[Point] = {
		var edge = List(start)
		for (cmd <- cmds) {
			edge = cmd.genEdge(edge)
		}
		println("Ends on "+edge.head)
		edge.reverse
	}

	def genGrid(edge: List[Point]): Grid = {
		val (minX,minY) = (edge.map(_.x).min, edge.map(_.y).min)
		val shift = Point(-minX, -minY)
		val newEdge = edge.map(_.add(shift))
		val (maxX,maxY) = (newEdge.map(_.x).max, newEdge.map(_.y).max)
		val grid = Grid(Array.fill(maxY.toInt+1)(Array.fill(maxX.toInt+1)('.')))
		grid.plotEdge(newEdge)
		grid
	}

	val dirs = Map('L'->Point(-1,0), 'R'->Point(1,0), 'U'->Point(0,-1), 'D'->Point(0,1))

	case class Command(dir: Char, n: Int, rgb: String) {
		val delta = dirs(dir)
		def genLine(from: Point): Line = Line(from, from.add(delta.scale(n)))
		def genEdge(edge: List[Point]): List[Point] = {
			var p = edge.head
			var newEdge = edge
			for (i <- 0 until n) {
				p = p.add(delta)
				newEdge = p::newEdge
			}
			newEdge
		}
	}

	case class Point(x: Long, y: Long) {
		def abs = Point(x.abs, y.abs)
		def neg = Point(-x, -y)
		def reflect = Point(y, x)
		def add(p: Point) = Point(x+p.x, y+p.y)
		def scale(n: Int) = Point(x*n, y*n)
		def div(n: Int) = Point(x/n, y/n)

		override def toString: String = s"($x,$y)"
	}

	case class Line(start: Point, end: Point) {
		val (minX,minY) = (start.x.min(end.x), start.y.min(end.y))
		val (maxX,maxY) = (start.x.max(end.x), start.y.max(end.y))
		def isVertical = start.x==end.x
		def onLine(p: Point) = p.x>=minX && p.x<=maxX && p.y>=minY && p.y<=maxY
		def vertEnd(y: Long) = if (y==minY) 'T' else if (y==maxY) 'B' else '-'
	}

	case class Image(lines: List[Line]) {
		val verticals = lines.filter(_.isVertical).sortBy(_.minX)
		val horizontals = lines.filter(!_.isVertical).sortBy(_.minY)
		val topLeft = Point(verticals.head.minX, horizontals.head.minY)
		val botRight = Point(verticals.last.maxX, horizontals.last.maxY)
		println(s"Bounds $topLeft $botRight")

		def fill: Long = {
			def fillDown(y: Long, prevLineFill: Long, horiz: List[Line]): Long = horiz match {
				case Nil => 0L
				case h::rest => {
					var n = (h.minY-y)*prevLineFill
					n+= fillLine(h.minY)
					n+= fillDown(h.minY+1, fillLine(h.minY+1), rest.dropWhile(_.minY==h.minY))
					n
				}
			}

			fillDown(topLeft.y, 0, horizontals)
		}

		def fillLine(y: Long): Long = {
			def fillAlong(x: Long, y: Long, inside: Boolean, vert: List[Line]): Long = {
				var remVerts = vert.dropWhile(l=> l.minY>y || l.maxY<y)
				if (remVerts.isEmpty) 0L
				else {
					val v1 = remVerts.head
					val x1 = v1.minX
					var n = 1L
					if (inside) n+= x1-x
					val corner = v1.vertEnd(y)
					if (corner=='-') {
						n + fillAlong(x1+1, y, !inside, remVerts.tail)
					}
					else {
						remVerts = remVerts.tail.dropWhile(l=> l.minY>y || l.maxY<y)
						val v2 = remVerts.head
						val x2 = v2.minX
						n+= x2-x1
						if (corner==v2.vertEnd(y))
							n + fillAlong(x2+1, y, inside, remVerts.tail)
						else
							n + fillAlong(x2+1, y, !inside, remVerts.tail)
					}
				}
			}
			fillAlong(topLeft.x, y, false, verticals)
		}
	}

	case class Grid(g: Array[Array[Char]]) {
		val h = g.size
		val w = g(0).size

		override def toString = g.map(_.mkString).mkString

		def print() = {
			g.foreach(l => println(l.mkString))
			println()
		}

		def printArr[Int](a: Array[Array[Int]]) = {
			a.foreach(l => println(l.mkString(", ")))
			println()
		}

		def get(p: Point): Option[Char] = if (inside(p)) Some(g(p.y.toInt)(p.x.toInt)) else None

		def inside(p: Point) = p.x>=0 && p.x<w && p.y>=0 && p.y<h

		val allDirs = List(Point(1,0), Point(0,1), Point(0,-1), Point(-1,0))

		def plotEdge(edge: List[Point]): Unit = {
			edge.foreach(p => g(p.y.toInt)(p.x.toInt)='#')
		}

		def fill(): Unit = {
			def isEmpty(p: Point) = get(p).map(_!='#').getOrElse(true)
			def getAboveBelowEmpty(p: Point) = (isEmpty(p.add(Point(0,-1))), isEmpty(p.add(Point(0,1))))
			def isUShape(p1: Point, p2: Point) = {
				val ab1 = getAboveBelowEmpty(p1)
				val ab2 = getAboveBelowEmpty(p2)
				ab1==ab2 && (ab1._1 || ab1._2)
			}

			for (y <- 0 until h) {
				var outside = true
				var prev = '.'
				var lineStart = Point(0,y)
				for (x <-0 until w) {
					val curr: Char = g(y)(x)
					curr match {
						case '.' => {
							if (prev!='.') {
								if (isUShape(lineStart, Point(x-1,y)))
									outside = !outside
							}
							if (!outside) g(y)(x) = 'I'
						}
						case _ => {
							if (prev=='.') {
								outside = !outside
								lineStart = Point(x,y)
							}
						}
					}
					prev = curr
				}
			}
		}

		def nFilled = toString.filter(_!='.').size

		def transpose: Grid = Grid(g.transpose)
	}

	def tokens(s: String): List[String] = s.split(' ').toList.map(_.trim).filter(_.size>0)


}