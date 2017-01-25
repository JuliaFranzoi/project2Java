import static org.junit.Assert.*;
import org.junit.*;
import shoppingCart.*;


public class ShopTest {
    Shop shop;
    Cart cart;
    Item item;

  @Before
  public void beforeEach(){
    shop = new Shop(15.00);
    cart = new Cart();
    item = new Item("cheese", 2.00, 2);

  } 

  @Test
  public void getFundsTest(){
    assertEquals(15.00, shop.getFunds(), 0.01);
  }

  @Test
  public void addFundsTest(){
    cart.addToBasket(item);
    double totalPriceOfCart = cart.getTotalPrice();
    shop.addFunds(totalPriceOfCart);
    assertEquals(17.00, shop.getFunds(), 0.01);

  }
  
  @Test
  public void giveRefundTest(){
    
    double refundValue = item.getPrice();
    cart.addToBasket(item);
    shop.giveRefund(refundValue);

    assertEquals(13.00, shop.getFunds(), 0.01);

}

}