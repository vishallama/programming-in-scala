package currency

object Japan extends CurrencyZone {
  abstract class Yen extends AbstractCurrency {
    def designation: String = "JPY"
  }
  type Currency = Yen
  def make(yen: Long): Yen = new Yen {
    val amount: Long = yen
  }
  val Yen: Yen = make(1)
  val CurrencyUnit: Yen = Yen
}
