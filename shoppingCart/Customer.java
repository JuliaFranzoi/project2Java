
package shoppingCart;
import behaviours.*;
import java.util.ArrayList;


public class Customer {
    private String name;
    private Cart cart;
    private Cardable card;
    

    public Customer(String name, Cart cart, Cardable card){
        this.name = name;
        this.cart = cart;
        this.card = card;

    }

    public String getName() {
        return this.name;
    }

    public Cardable getCard(){
        return this.card;
    }
    
    public void setCard(Cardable newCard){   
        this.card = newCard;
    }

    public Cart getCart(){
        return this.cart;
    } 
 

    public void payForCart(){
        double funds = card.getFunds();
        double totalPriceOfCart = cart.getTotalPrice();
        if(funds >= totalPriceOfCart){
           funds -= totalPriceOfCart;  
        } else { 
          System.out.println("Not enough funds");
        }
    }
   
}

