import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import shoppingCart.*;

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

  @Test
  public void getCardTest(){
    assertNotNull(customer.getCard());
  }
  
  @Test
  public void getCardFundsTest(){
    
    assertEquals(100.00, customer.getCard().getFunds(), 0.01);
  }

  @Test
  public void setCardtest(){
    CreditCard creditcard = new CreditCard("creditcard",  100.00);
    customer.setCard(creditcard);
    assertEquals("creditcard", customer.getCard().getNumber());
    }

//   @Test
//   public void payForCartTest(){
//     double price = cart.getTotalPrice();
    
//     assertEquals(98.00, customer.getCard().getFunds(),0.01);
  
  
// }

  }







 

