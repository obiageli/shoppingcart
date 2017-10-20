package controller

import model.Fruits

class ShoppingCart {
  
    /**
    * total for Fruits in shoppingCart
    */
  def total(productList: List[Fruits]) = productList.map(_.price).sum
  
    /**
    * Total price for fruits on a 3 for the price of two for oranges and
    * 2 for the price of one for apples
    */
  def orangesAndApplesOnOffer(productList: List[Fruits]): Double = {
    val numOfOranges = productList.count(c => c.name.equalsIgnoreCase("orange"))
    val numOfApples = productList.count(c => c.name.equalsIgnoreCase("apple"))
    val costOfOrangesAt3For1 = ((numOfOranges / 3) * 0.5) + ((numOfOranges % 3) * 0.25)
    val costOfApplesAt2For1 = ((numOfApples / 2) * 0.60) + ((numOfApples % 2) * 0.60)
    costOfOrangesAt3For1 + costOfApplesAt2For1
  }
  

}