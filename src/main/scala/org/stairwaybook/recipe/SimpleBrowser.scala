package org.stairwaybook.recipe

object SimpleBrowser {
  def recipesUsing(food: Food): List[Recipe] =
    SimpleDatabase.allRecipes.filter(recipe =>
      recipe.ingredients.contains(food))

  def displayCategory(category: SimpleDatabase.FoodCategory): Unit = {
    println(category)
  }
}
