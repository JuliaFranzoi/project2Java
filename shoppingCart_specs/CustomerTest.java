import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import shoppingCart.*;

public class CustomerTest{
  Customer customer;
  Item item;
  Cart cart;
  Shop shop;
  DebitCard debitcard;



  @Before
  public void beforeEach(){
    item = new Item("cheese", 2.00, 2);
    cart = new Cart();
    cart.addToBasket(item);
    debitcard = new DebitCard("debitcard", 100.00);
    customer = new Customer("julia", cart, debitcard);
  }

  @Test
  public void getNameTest(){
    assertEquals("julia", customer.getName());
  }

  @Test
  public void getCardTest(){
    assertEquals("debitcard", customer.getCard());
  }
  

  }



  // @Test
  // public void addToBasketTest(){
  //   customer.addToBasket(item);

  //   assertEquals(1, customer.countItems());
  // }



  // @Test
  // public void DecreaseFundsTest(){
         
  //   assertEquals(10.00, customer.getFunds(), 0.01);
  // }


  // @Test 
  // public void IncreaseFundsTest(){
  //   assertEquals(10.00, customer.getFunds(), 0.01);
  // }

