import static org.junit.Assert.*;
import org.junit.*;
import shoppingCart.*;

public class TransactionTest{
  private Customer customer;
  private Shop shop;
  private DebitCard debitcard;
  private Cart cart;
  private Item item;
  private Transaction transaction;

  @Before
  public void beforeEach(){
    shop = new Shop(15.00);
    cart = new Cart();
    
    debitcard = new DebitCard("debitcard", 100.00);
    customer = new Customer("julia", cart, debitcard);
    item = new Item("cheese", 2.00, 2);
    cart.addToBasket(item);
    transaction = new Transaction (customer, shop);
   } 
  
  
  @Test
  public void hasCustomerTest(){
    assertNotNull(transaction.getCustomer());
      
    }

   @Test
   public void transactionTest(){
    transaction.sale();
    assertEquals(98.00, debitcard.getFunds(), 0.01);
   }

  



}

  






