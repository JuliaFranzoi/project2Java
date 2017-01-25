package shoppingCart;


public class Item{
  private String id;
  private Double price;
  private int quantity;

  public Item(String id, Double price, int quantity){
    this.id = id;
    this.price = price;
    this.quantity = quantity;
  }
   public String getId(){
    return this.id;
   }
   
  public Double getPrice(){
    return this.price;
   }
  
  public int getQuantity(){
    return this.quantity;
  }

 
}