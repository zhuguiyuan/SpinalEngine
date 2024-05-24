import spinal.core._
import spinal.lib._

// Hardware definition
case class MyTopLevel() extends Component {
  val io = new Bundle {
    val cond0 = in  Bool()
    val cond1 = in  Bool()
    val flag  = out Bool()
    val state = out UInt(8 bits)
  }
}

object TopVerilog extends App {
  val report = Config.spinal.generateVerilog(Top())
  println(report.getRtlString())
}
