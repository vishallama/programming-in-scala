package abstractmembers

class Concrete extends Abstract {
  type T = String
  def transform(x: String): String = x + x
  val initial: String = "hi"
  var current: String = initial
}
