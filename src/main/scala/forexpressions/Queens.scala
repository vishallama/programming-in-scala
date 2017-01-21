package forexpressions

object Queens {
  def main(args: Array[String]): Unit = {
    println("Solution for 1x1:\n" + queens(1) + "\n")
    println("Solution for 2x2:\n" + queens(2) + "\n")
    println("Solution for 3x3:\n" + queens(3) + "\n")
    println("Solution for 4x4:\n" + queens(4) + "\n")
  }

  def queens(n: Int): List[List[(Int, Int)]] = {
    def placeQueens(k: Int): List[List[(Int, Int)]] =
      if (k == 0) List(List())
      else
        for {
          queens <- placeQueens(k - 1)
          column <- 1 to n
          queen = (k, column)
          if isSafe(queen, queens)
        } yield queen :: queens
    placeQueens(n)
  }

  private def isSafe(queen: (Int, Int), queens: List[(Int, Int)]) =
    queens.forall (q => !inCheck(queen, q))

  private def inCheck(q1: (Int, Int), q2: (Int, Int)) =
    q1._1 == q2._2 ||   // same row
    q1._2 == q2._2 ||   // same column
    (q1._1 - q2._1).abs == (q1._2 - q2._2).abs  // on diagonal
}
