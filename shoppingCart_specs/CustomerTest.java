import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import shoppingCart2.*;

public class CustomerTest{
  Customer customer;
  Item item;
  Cart cart;
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

  // @Test
  // public void getCardTest(){
  //   assertEquals("debitcard", customer.getCard());
  // }
  
  // @Test
  // public void setCardtest(){
  //   assertEquals("debitcard", customer.setCard());
  //   }
  }

  







 

