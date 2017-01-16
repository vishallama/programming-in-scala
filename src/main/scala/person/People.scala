package person


import OrderedMergeSort._

object People {
  def main(args: Array[String]): Unit = {
    val people = List(
      new Person("Larry", "Wall"),
      new Person("Anders", "Hejlsberg"),
      new Person("Guido", "van Rossum"),
      new Person("Alan", "Kay"),
      new Person("Yukihiro", "Matsumoto")
    )

    val sortedPeople = orderedMergeSort(people)
    println(sortedPeople)
  }
}
