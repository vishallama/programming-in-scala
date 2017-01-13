package expressions

sealed abstract class Expr
case class Var(name: String) extends Expr
case class Number(num: Double) extends Expr
case class UnOp(operator: String, arg: Expr) extends Expr
case class BinOp(operator: String,
                 left: Expr,
                 right: Expr) extends Expr

object Expr {

  def simplifyTop(expr: Expr): Expr =
    expr match {
      case UnOp("-", UnOp("-", e)) => e           // Double negation
      case UnOp("abs", e @ UnOp("abs", _)) => e   // Absolute value
      case BinOp("+", e, Number(0)) => e          // Adding zero
      case BinOp("*", e, Number(1)) => e          // Multiplying by one
      case _ => expr
    }

  def simplifyAdd(e: Expr): Expr =
    e match {
      case BinOp("+", x, y) if x == y =>
        BinOp("*", x, Number(2))
      case _ => e
    }

  def describe(e: Expr): String = (e: @unchecked) match {
    case Number(_) => "a number"
    case Var(_) => "a variable"
  }

}
