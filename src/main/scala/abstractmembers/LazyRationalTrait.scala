package abstractmembers

trait LazyRationalTrait {
  val numerArg: Int
  val denomArg: Int
  lazy val numer: Int = numerArg / g
  lazy val denom: Int = denomArg / g

  override def toString: String = numer + "/" + denom
  private lazy val g = {
    require(denomArg != 0)
    gcd(numerArg, denomArg)
  }
  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)
}
