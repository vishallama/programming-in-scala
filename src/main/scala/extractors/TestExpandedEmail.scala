package extractors

object TestExpandedEmail {
  def main(args: Array[String]): Unit = {
    val s = "tom@support.epfl.ch"
    val ExpandedEmail(name, topdom, subdoms @ _*) = s
    println(name + "\n" + topdom + "\n" + subdoms)
  }
}
