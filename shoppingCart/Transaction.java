package shoppingCart;
import behaviours.*;

public class Transaction {
  private Customer customer;
  private Shop shop;
  // private cardable;

  public Transaction(Customer customer, Shop shop){
    this.customer = customer;
    this.shop = shop;
  }


  public Customer getCustomer(){
    return this.customer = customer;
  }

  public void sale(){
    double priceOfCart = getCustomer().getCart().getTotalPrice();
    getCustomer().getCard().decreaseFund(priceOfCart);
    // getshop.addFunds(priceOfCart);  
    } 

  // public void refund(String itemName){

  //   Double itemPrice = customer.getCart().chooseItem(itemName).getPrice();
  //   customer.getCard().getRefund(itemPrice);
  //   shop.giveRefund(itemPrice);

  // }
}
