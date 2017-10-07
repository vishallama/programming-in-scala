package list

sealed abstract class List[+T] {
  def isEmpty: Boolean
  def head: T
  def tail: List[T]

  def ::[U >: T](x: U): List[U] = new ::(x, this)

  def :::[U >: T](prefix: List[U]): List[U] =
    if (prefix.isEmpty) this
    else prefix.head :: prefix.tail ::: this

  def length: Int =
    if (isEmpty) 0 else 1 + tail.length

  def drop(n: Int): List[T] =
    if (isEmpty) Nil
    else if (n <= 0) this
    else tail.drop(n-1)

  def map[U](f: T => U): List[U] =
    if (isEmpty) Nil
    else f(head) :: tail.map(f)
}

case object Nil extends List[Nothing] {
  def isEmpty: Boolean =
    true
  def head: Nothing =
    throw new NoSuchElementException("head of empty list")
  def tail: List[Nothing] =
    throw new NoSuchElementException("tail of empty list")
}

final case class ::[T](head: T, tail: List[T])
  extends List[T] {
  def isEmpty: Boolean = false
}
