// Compute gcd of two numbers using a while loop
def gcdLoop(x: Long, y: Long): Long = {
  var a: Long = x
  var b: Long = y
  while (a != 0) {
    val temp = a
    a = b % a
    b = temp
  }
  b
}
