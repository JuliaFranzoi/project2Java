package shoppingCart;
import java.util.ArrayList;

public class Cart{

  private ArrayList<Item>basket;
  
  public Cart(){
    this.basket = new ArrayList<Item>();
  }

  public void addToBasket(Item item){
    basket.add(item);
  }

  public void removeItem(Item item){
    basket.remove(item);
  }
  
  public int countItems(){
    return basket.size();
  }

  public double getTotalPrice(){
    double totalPrice = 0.0;
    for (Item item : basket){
      totalPrice += item.getPrice();
    }
    return totalPrice;
  }

 public Item chooseItem(String itemName){
  Item foundItem = null;
     for (Item i : basket){
         if (i.getId().equals(itemName)){
             foundItem = i;
         }       
     }
     return foundItem;
 }
  

}