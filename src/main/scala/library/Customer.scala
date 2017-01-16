package library

object Customer {
  def main(args: Array[String]): Unit = {
    def getTitle(p: Publication): String = p.title
    Library.printBookList(getTitle)
  }
}
