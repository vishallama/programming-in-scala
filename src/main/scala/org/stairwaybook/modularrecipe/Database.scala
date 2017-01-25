package org.stairwaybook.modularrecipe

abstract class Database {
  def allFoods: List[Food]
  def allRecipes: List[Recipe]
  def allCategories: List[FoodCategory]

  def foodNamed(name: String): Option[Food] =
    allFoods.find(_.name == name)

  case class FoodCategory(name: String, foods: List[Food])
}
