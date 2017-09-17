package functions

import scala.io.{BufferedSource, Source}

object LongLines {

  def processFile(filename: String, width: Int): Unit = {
    def processLine(line: String): Unit = {
      if (line.length > width)
        println(filename + ": " + line.trim)
    }

    val source: BufferedSource = Source.fromFile(filename)
    for (line <- source.getLines())
      processLine(line)
  }
}
