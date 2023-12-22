package net.snowtiger.aoc

/**
 * @author mark
 */

object AOC20
{
	val input = "%fl -> tf, gz\n%xb -> hl, tl\n%mq -> tf, fl\n%px -> hl, tm\n%dp -> xv\nbroadcaster -> js, ng, lb, gr\n&ql -> rx\n%gk -> hm\n%vp -> vf, sn\n%fp -> xb\n&lr -> ss, rm, dc, js, gk, dp, bq\n%xl -> gx, lr\n%xx -> hb\n%cb -> jg\n&hl -> nj, lb, tl, xx, hb, fp, mf\n%vr -> tf, hq\n%bq -> gk\n%jg -> qn\n%hb -> qk\n%qk -> hs, hl\n%gz -> tf\n%rm -> hj\n&tf -> cb, jg, fz, gr, zj, qn, kb\n%qn -> td\n%js -> lr, dc\n%qb -> nc\n%zj -> vr\n%td -> tf, zj\n%tl -> kg\n%gx -> lr\n%hm -> lr, rd\n&fh -> ql\n%nj -> xx\n%hq -> kb, tf\n%kg -> px, hl\n%dc -> dp\n%vf -> th, sn\n&mf -> ql\n%tm -> hl\n&fz -> ql\n%xd -> tn, sn\n%ng -> vp, sn\n%th -> qb\n%rd -> xl, lr\n%bt -> xd, sn\n%tv -> sn\n%nl -> bt\n%hs -> fp, hl\n%xv -> rm, lr\n%tn -> sn, tv\n%hj -> lr, bq\n&ss -> ql\n%sd -> nl\n&sn -> sd, fh, th, qb, nl, ng, nc\n%kb -> mq\n%lb -> nj, hl\n%gr -> tf, cb\n%nc -> sd"
	val input1 = "broadcaster -> a, b, c\n%a -> b\n%b -> c\n%c -> inv\n&inv -> a"
	val input2 = "broadcaster -> a\n%a -> inv, con\n&inv -> b\n%b -> con\n&con -> output"
	val input3 = "broadcaster -> ng\n&ql -> rx\n&fh -> ql\n&sn -> fh, sd, th, qb, nl, ng, nc\n%tv -> sn\n%vp -> sn, vf\n%vf -> sn, th\n%xd -> sn, tn\n%tn -> sn, tv\n%bt -> sn, xd\n%ng -> sn, vp\n%th -> qb\n%qb -> nc\n%nc -> sd\n%sd -> nl\n%nl -> bt"

	def main(args: Array[String]): Unit =
	{
		val lines = input3.split("\\\n").toList
		val modules = lines.map(parseModule)
		val wiring = Wiring(modules.groupBy(_.name).map(p=> (p._1,p._2.head)))

		val t = System.currentTimeMillis()
		//wiring.initState()
		//val res = wiring.press(1000)
		//println(res)
		wiring.initState()
		// This never completes... instead look at the output and see what the cycles for the fh, fz, mf and ss modules are.
		// The answer is the LCM of these four cycle numbers...
		val n = wiring.untilMachineOn()
		println(n)
		println((System.currentTimeMillis()-t)+"ms")
	}

	def parseModule(line:String): Module = {
		val s"$mod -> $outs" = line
		val outputs = outs.split(',').map(_.trim).toList
		mod match {
			case s"%$n" => FlipFlop(n, outputs)
			case s"&$n" => Conjunction(n, outputs)
			case _ => Broadcast(mod, outputs)
		}
	}

	case class Signal(from: String, to: String, pulse: Boolean)

	trait Module {
		def name: String
		def outs: List[String]
		def init(ins: List[String])
		def receive(signal: Signal): List[Signal]
		def send(pulse: Boolean) = outs.map(Signal(name,_,pulse))
		def shortString = ""
		def stateString(state: Boolean) = if (state) "H" else "_"
		def nStates = 1L
	}

	case class Broadcast(name: String, outs: List[String]) extends Module {
		override def init(ins: List[String]) = {}
		override def receive(signal: Signal) = send(signal.pulse)
	}

	case class FlipFlop(name: String, outs: List[String]) extends Module {
		var state = false
		override def init(ins: List[String]) = {state = false}
		override def receive(signal: Signal) =
			if (!signal.pulse) {
				state = !state
				send(state)
			}
			else Nil
		override def shortString = "%"+name+"="+stateString(state)
		override def nStates: Long = 2L
	}

	case class Conjunction(name: String, outs: List[String]) extends Module {
		var state = Map[String,Boolean]()
		override def init(ins: List[String]) = {
			state = ins.map(in => Tuple2(in,false)).toMap
		}
		override def receive(signal: Signal) = {
			state+= signal.from->signal.pulse
			val allHigh = state.values.forall(identity)
			send(!allHigh)
		}
		override def shortString = "&"+name+"="+state.values.map(stateString).mkString
		override def nStates: Long = Math.pow(2, state.size).toLong
	}

	case class Wiring(modules: Map[String,Module]) {
		var loSent = 0
		var hiSent = 0
		var machineOn = false
		var endStates:Map[String,Long] = Map("fh"->0,"mf"->0,"fz"->0,"ss"->0)
		def initState(): Unit = {
			loSent = 0
			hiSent = 0
			machineOn = false
			modules.values.foreach(init)
		}
		def init(m: Module) = m.init(modules.values.filter(_.outs.contains(m.name)).map(_.name).toList)
		def record(pulse: Boolean) = if (pulse) hiSent+=1 else loSent+=1
		def pressButton(pulse: Boolean, n: Long): Unit = {
			var curr = List(Signal("", "broadcaster", pulse))
			var c = 0
			while (curr.nonEmpty) {
				var next = List[Signal]()
				for (s <- curr) {
					record(s.pulse)
					if (s.to=="rx" && !s.pulse) machineOn = true
					next++= modules.get(s.to).map(_.receive(s)).toList.flatten
					updateEndStates(n)
				}
				c+= 1
				//printState
				//println(n+" "+c+" "+modules.values.map(_.shortString).mkString(" ")+" "+next.mkString(" "))
				curr = next
			}
			println(n+" "+c+" "+modules.values.map(_.shortString).mkString(" "))
			//println(n+" "+c)
		}
		def press(n: Long): Long = {
			var c = 0L
			while (c<n) {
				c+= 1
				pressButton(false, c)
			}
			hiSent*loSent
		}
		def untilMachineOn(): Long = {
			var c = 0L
			while (!machineOn) {
				c+= 1
				pressButton(false, c)
				//printState
			}
			c
		}

		def updateEndStates(c: Long) = {
			val es = endStates.keys
			var changed = false
			for (name <- es) {
				if (modules.get(name).map(_.shortString.endsWith("_")).getOrElse(false)) {
					val esc = endStates(name)
					if (c>esc) {
						endStates+= name->c
						changed=true
						println(c+" "+name+" "+(c-esc))
					}
				}
			}
			//if (changed)				println(endStates)
		}

		var statesSeen = Set[String]()
		def printState = {
			val state = modules.values.map(_.shortString).mkString(" ")
			if (statesSeen(state)) throw new Exception("Seen "+state)
			statesSeen+= state
			println(statesSeen.size+" "+state)
		}
	}

	def tokens(s: String): List[String] = s.split(' ').toList.map(_.trim).filter(_.size>0)


}