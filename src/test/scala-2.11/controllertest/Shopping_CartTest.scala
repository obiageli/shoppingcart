package controllertest

import org.scalatest.FlatSpec
import controller.ShoppingCart
import model.Fruits

class ShoppingCartTest extends FlatSpec{
  val shoppingCart = new ShoppingCart()
  val list = List(Fruits("apple", 0.60), Fruits("orange", 0.25), Fruits("orange", 0.25),Fruits("orange", 0.25),Fruits("orange", 0.25),Fruits("orange", 0.25),Fruits("orange", 0.25),Fruits("orange", 0.25),Fruits("apple", 0.60))
  
  "Shopping cart " should " have a total of 1.1 " in {
    assert(shoppingCart.total(list) == 2.95)
  }
  
   it should "have a total on offer of 1.85  for the sum of 3 for the price of 2 on oranges and 2 for the price of 1 on apples" in {
   assert(shoppingCart.orangesAndApplesOnOffer(list) == 1.85)
  }
  
}