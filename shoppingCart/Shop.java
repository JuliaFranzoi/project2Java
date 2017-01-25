package shoppingCart;

public class Shop {
    private Double funds;
   

    public Shop(Double funds){
        this.funds = funds;
    }
   

    public Double getFunds() {
        return funds;
    }

    public void addFunds(Double cartPrice){
        funds += cartPrice;

    }

    public void giveRefund(Double refundValue){
        funds -= refundValue;

    }
}