import static org.junit.Assert.*;
import org.junit.*;
import shoppingCart.*;

public class DebitCardTest{
  DebitCard debitcard;
  Shop shop;

  @Before
  public void beforeEach(){
    debitcard = new DebitCard("1234", 100.00);
    shop = new Shop(100.00);}

  @Test
  public void getNumberTest(){
    assertEquals("1234", debitcard.getNumber());
  }

  @Test 
  public void getFundsTest(){
    assertEquals(100.00, debitcard.getFunds(), 0.01);
  }


}
