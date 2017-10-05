package currency

object US extends CurrencyZone {
  abstract class Dollar extends AbstractCurrency {
    def designation: String = "USD"
  }
  type Currency = Dollar
  def make(cents: Long): Dollar = new Dollar {
    val amount: Long = cents
  }
  val Cent: Dollar = make(1)
  val Dollar: Dollar = make(100)
  val CurrencyUnit: Dollar = Dollar
}
