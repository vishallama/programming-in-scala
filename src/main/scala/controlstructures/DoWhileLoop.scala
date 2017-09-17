package controlstructures

object DoWhileLoop extends App {
  var line: String = ""
  do {
    line = scala.io.StdIn.readLine()
    println("Read: " + line)
  } while (line != "")
}
