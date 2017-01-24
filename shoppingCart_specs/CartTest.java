import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import shoppingCart.*;

public class CartTest{
  Cart cart;
  Customer customer;
  Item item1;
  Item item2;
  // ArrayList<Item>basket;

  @Before
  public void beforeEach(){
    cart = new Cart();
    item1 = new Item("cheese", 2.00, 2);
    item2 = new Item("1234", 4.00, 2);
    cart.addToBasket(item1);
    cart.addToBasket(item2);
  }
  
 
  @Test
  public void addToBasketTest(){
    assertEquals(2, cart.countItems());
  }

  @Test
  public void removeItemTest(){
    cart.removeItem(item2);
    assertEquals(1, cart.countItems());
  }

  @Test
  public void getTotalPriceTest()
  {
    assertEquals(6.00, cart.getTotalPrice(), 0.01);
 }

  @Test
  public void getTotalPriceMoreItemsTest()
  {
    assertEquals(6.00, cart.getTotalPrice(), 0.01);
}

  @Test
  public void chooseItemTest(){
    assertNotNull(cart.chooseItem("1234"));
 }

  @Test
  public void chooseNoItemTest(){
    assertEquals("Product Not found", cart.chooseItem("12rt"));
  }

}