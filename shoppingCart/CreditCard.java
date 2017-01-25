package shoppingCart2;
import behaviours.*;

public class CreditCard implements Cardable{
  private String number; 
  private double funds;

  public CreditCard(String number, double funds){
    this.number = number;
    this.funds = funds;
  }
  

  public String getNumber() {
      return this.number;
  }

  public double getFunds() {
      return this.funds;
  }

  public void getRefund(double totalRefund){
      funds+=totalRefund;
  }  

}