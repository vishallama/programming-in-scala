// String interpolation

// The s string interpolator
val name = "reader"
s"Hello, $name!"
s"The answer is ${6 * 7}"

// The raw string interpolator behaves like s, except
// it does not recognize character literal escape
// sequences.
raw"No\\\\escape!"

// The f string interpolator allows you to attach
// printf-style formatting instructions to embedded
// expressions.
f"${math.Pi}%.5f"

val pi = "Pi"
f"$pi is approximately ${math.Pi}%.8f"
