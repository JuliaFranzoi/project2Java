package shoppingCart2;
import behaviours.*;

public class DebitCard implements Cardable{
  private String number; 
  private double funds;

  public DebitCard(String number, double funds){
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