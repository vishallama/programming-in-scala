package sorting.insertionsort

object InsertionSort {
  def insert(x: Int, xs: List[Int]): List[Int] = xs match {
    case List() => List(x)
    case y :: ys if x > y => y :: insert(x, ys)
    case _ => x :: xs
  }

  def isort(xs: List[Int]): List[Int] = xs match {
    case List() => List()
    case x :: xs1 => insert(x, isort(xs1))
  }
}
