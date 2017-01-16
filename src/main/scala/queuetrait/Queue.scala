package queuetrait

trait Queue[+T] {
  def head: T
  def tail: Queue[T]
  def enqueue[U >: T](x: U): Queue[U]
}

object Queue {

  def apply[T](xs: T*): Queue[T] =
    new QueueImpl[T](xs.toList, Nil)

  private class QueueImpl[+T](
                            private val leading: List[T],
                            private val trailing: List[T]
                            ) extends Queue[T] {

    def mirror: QueueImpl[T] =
      if (leading.isEmpty)
        new QueueImpl(trailing.reverse, Nil)
      else
        this

    def head: T = mirror.leading.head

    def tail: QueueImpl[T] = {
      val q = mirror
      new QueueImpl(q.leading.tail, q.trailing)
    }

    def enqueue[U >: T](x: U): QueueImpl[U] =
      new QueueImpl(leading, x :: trailing)
  }
}
