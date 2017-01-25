import static org.junit.Assert.*;
import org.junit.*;
import shoppingCart.*;

public class ItemTest {
  Item item;


  @Before
  public void beforeEach() {
    item = new Item("cheese", 2.00, 2);
  }

  @Test
  public void getIdTest(){
    assertEquals("cheese", item.getId());
   
  }

  @Test
  public void getPrice(){
    assertEquals(item.getPrice(), 2.00, 0.01);
   
  }

  @Test
  public void getQuantity(){
    assertEquals(item.getQuantity(), 2);
   
  }

}
