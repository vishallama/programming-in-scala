package animals

class Cow extends Animal {
  type SuitableFood = Grass

  override def eat(food: Grass): Unit = {}
}
