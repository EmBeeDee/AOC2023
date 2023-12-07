package net.snowtiger.aoc

/**
 * @author mark
 */

object AOC6
{
	val input = "Time:      7  15   30\nDistance:  9  40  200"
	val input1 = "Time:        51     69     98     78\nDistance:   377   1171   1224   1505"

	def main(args: Array[String]): Unit =
	{
		val lines = input1.split('\n').toList
		val races = getRaces(lines)
		//val races = List(getRace(lines))
		races.foreach(println(_))

		println(races.map(_.nWaysToWin))
		println(races.map(_.nWaysToWinQuadratic))

		val result = races.map(_.nWaysToWin).product
		println(result)

		println(-8.5d.toInt)
	}

	def tokens(s: String): List[String] = s.split(' ').toList.map(_.trim).filter(_.size>0)

	case class Race(time: Long, record: Long) {
		def distance(holdTime: Long): Long = (time-holdTime)*holdTime

		def winningDistances: List[Long] = {
			(1L until time).toList.map(distance).filter(_>record)
		}

		def nWaysToWin = winningDistances.size

		def nWaysToWinQuadratic: Int = {
			val quadD = (Math.sqrt(time*time - 4*record)/2.0)
			val t2 = time.toDouble/2.0
			println(""+ (t2-quadD)+" "+(t2+quadD))
			val quad = (Math.sqrt(time*time - 4*record)/2.0)
			(t2+quad).ceil.toInt - (t2-quad).toInt
		}


	}

	def getRaces(lines: List[String]): List[Race] = {
		val times = tokens(lines.head).tail
		val dists = tokens(lines.tail.head).tail
		times.zip(dists).map(p => Race(p._1.toLong, p._2.toLong))
	}

	def getRace(lines: List[String]): Race = {
		val times = tokens(lines.head).tail
		val dists = tokens(lines.tail.head).tail
		Race(times.mkString.toLong, dists.mkString.toLong)
	}

}