package myassert

object MyAssert {
  val assertionsEnabled = true

  def byNameAssert(predicate: => Boolean): Unit =
    if (assertionsEnabled && !predicate)
      throw new AssertionError
}
