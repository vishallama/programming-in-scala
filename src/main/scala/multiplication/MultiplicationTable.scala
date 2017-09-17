package multiplication

object MultiplicationTable {
  private val MaxPad = 4

  // Returns a row as a sequence
  private def makeRowSeq(row: Int): Seq[String] = {
    for (col <- 1 to 10) yield {
      val prod = (row * col).toString
      val padding = " " * (MaxPad - prod.length)
      padding + prod
    }
  }

  // Returns a row as a string
  private def makeRow(row: Int) = makeRowSeq(row).mkString

  // Returns table as a string with one row per line
  def multiTable: String = {
    val tableSeq = // a sequence of row strings
      for (row <- 1 to 10)
        yield makeRow(row)

    tableSeq.mkString("\n")
  }
}

