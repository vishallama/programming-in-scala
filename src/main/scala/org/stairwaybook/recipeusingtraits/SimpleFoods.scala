package org.stairwaybook.recipeusingtraits

trait SimpleFoods {
  object Pear extends Food("Pear")
  object Apple extends Food("Apple")

  def allFoods = List(Apple, Pear)
  def allCategories = Nil
}
