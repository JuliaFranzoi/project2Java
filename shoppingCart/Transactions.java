package shoppingCart;

public class Transactions {
  private Customer customer;
  private Shop shop;

  public Transactions(){
    this.customer = customer;
    this.shop = shop;
  }

  public void sale(){
    double priceOfCart = customer.getCart().getTotalPrice();
    customer.payForCart();
    shop.addFunds(priceOfCart);  
    } 

  public void refund(String itemName){

    Double itemPrice = customer.getCart().chooseItem(itemName).getPrice();
    customer.getCard().getRefund(itemPrice);
    shop.giveRefund(itemPrice);

  }
}
