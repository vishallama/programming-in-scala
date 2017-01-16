package queueclass

class Queue[+T] private (
                       private[this] var leading: List[T],
                       private[this] var trailing: List[T]
                       ) {
  private def mirror(): Unit =
    if (leading.isEmpty) {
      while (trailing.nonEmpty) {
        leading = trailing.head :: leading
        trailing = trailing.tail
      }
    }

  def head: T = {
    mirror()
    leading.head
  }

  def tail: Queue[T] = {
    mirror()
    new Queue(leading.tail, trailing)
  }

  def enqueue[U >: T](x: U): Queue[U] =
    new Queue(leading, x :: trailing)
}

object Queue {
  // constructs a queue with initial elements 'xs'
  def apply[T](xs: T*): Queue[T] = new Queue[T](xs.toList, Nil)
}
