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
  
  
}