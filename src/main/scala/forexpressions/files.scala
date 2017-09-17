package forexpressions

import java.io.File

object files extends App {
  val filesHere = new File("./src/main/scala/forexpressions").listFiles

  for (file <- filesHere)
    println(file)

  for (file <- filesHere if file.getName.endsWith(".scala"))
    println(file)

  def fileLines(file: java.io.File) =
    scala.io.Source.fromFile(file).getLines().toList

  def grep(pattern: String): Unit =
    for {
      file <- filesHere
      if file.getName.endsWith(".scala")
      line <- fileLines(file)
      trimmed = line.trim
      if trimmed.matches(pattern)
    } println(file + ": " + trimmed)

  grep(".*for.*")

  def scalaFiles: Array[File] =
    for {
      file <- filesHere
      if file.getName.endsWith(".scala")
    } yield file

  println(scalaFiles.toList)
}
