package forexpressions

object PersonApp extends App {
  val lara = Person("Lara", isMale = false)
  val bob = Person("Bob", isMale = true)
  val julie = Person("Julie", isMale = false, lara, bob)
  val persons = List(lara, bob, julie)

  // Names of all pairs of mothers and their children
  val pairs = persons filter(p => !p.isMale) flatMap (p =>
    p.children map (c => (p.name, c.name)))
  println(pairs)

  val pairs1 = for (p <- persons; if !p.isMale; c <- p.children)
    yield (p.name, c.name)
  println(pairs1)
}
