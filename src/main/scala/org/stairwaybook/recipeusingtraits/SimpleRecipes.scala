package org.stairwaybook.recipeusingtraits

trait SimpleRecipes {
  this: SimpleFoods =>
  object FruitSalad extends Recipe(
    "fruit salad",
    List(Apple, Pear),    // Pear is in scope
    "Mix it all together."
  )
  def allRecipes = List(FruitSalad)
}
