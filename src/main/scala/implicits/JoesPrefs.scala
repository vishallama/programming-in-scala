package implicits

object JoesPrefs {
  implicit val prompt: PreferredPrompt = new PreferredPrompt("Yes, master> ")
  implicit val drink: PreferredDrink = new PreferredDrink("tea")
}
