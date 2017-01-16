package queueclass

class Queue[T] private (
                       private val leading: List[T],
                       private val trailing: List[T]
                       ) {
  private def mirror =
    if (leading.isEmpty)
      new Queue(trailing.reverse, Nil)
    else
      this

  def head: T= mirror.leading.head

  def tail: Queue[T] = {
    val q = mirror
    new Queue(q.leading.tail, q.trailing)
  }

  def enqueue(x: T): Queue[T] =
    new Queue(leading, x :: trailing)
}

object Queue {
  // constructs a queue with initial elements 'xs'
  def apply[T](xs: T*): Queue[T] = new Queue[T](xs.toList, Nil)
}
