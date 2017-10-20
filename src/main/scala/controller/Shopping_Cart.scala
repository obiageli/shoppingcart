package controller

import model.Fruits

class ShoppingCart {
  
    /**
    * total for Fruits in shoppingCart
    */
  def total(productList: List[Fruits]) = productList.map(_.price).sum

}