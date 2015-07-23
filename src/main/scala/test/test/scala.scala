package test.test

/**
 * Created by pedro on 23/07/2015.
 */
class test {

  import scalaz._
  import scalaz.syntax.order._
  import scalaz.std.string._
  case class Carro(marca:String)

  val carros = List(Carro("Wosk"), Carro("BMW"), Carro("Fiat"))
  implicit val carroOrder = Order.orderBy[Carro, String](_.marca)


}
