package animals

class Dog extends Animal {
  type SuitableFood = DogFood

  override def eat(food: DogFood): Unit = {}
}
