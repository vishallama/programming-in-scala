package extractors

object TestDomain {

  def main(args: Array[String]): Unit = {
    println(isTomInDotCom("tom@sun.com"))
    println(isTomInDotCom("peter@sun.com"))
    println(isTomInDotCom("tom@acm.org"))
  }

  def isTomInDotCom(s: String): Boolean = s match {
    case Email("tom", Domain("com", _*)) => true
    case _ => false
  }
}
