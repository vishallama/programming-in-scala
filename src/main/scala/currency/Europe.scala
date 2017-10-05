package currency

object Europe extends CurrencyZone {
  abstract class Euro extends AbstractCurrency {
    def designation: String = "EUR"
  }
  type Currency = Euro
  def make(cents: Long): Euro = new Euro {
    val amount: Long = cents
  }
  val Cent: Euro = make(1)
  val Euro: Euro = make(100)
  val CurrencyUnit: Euro = Euro
}
