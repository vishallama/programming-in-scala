package library

object Library {
  val books: Set[Book] =
    Set(
      new Book("Programming in Scala"),
      new Book("Walden"),
      new Book("Pride and Prejudice"),
      new Book("War and Peace")
    )

  def printBookList(info: Book => AnyRef): Unit = {
    for (book <- books) println(info(book))
  }
}
