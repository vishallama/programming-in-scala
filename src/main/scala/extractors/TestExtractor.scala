package extractors

object TestExtractor {

  def userTwiceUpper(s: String): String = s match {
    case Email(Twice(x @ UpperCase()), domain) =>
      "match: " + x + " in domain " + domain
    case _ =>
      "no match"
  }

  def main(args: Array[String]): Unit = {
    println(userTwiceUpper("DIDI@hotmail.com"))
    println(userTwiceUpper("DIDO@hotmail.com"))
    println(userTwiceUpper("didi@hotmail.com"))
  }
}
