package behaviours;

public interface Cardable {

   String getNumber(); 


   double getFunds(); 
      

   void getRefund(double totalRefund);
      
   void decreaseFund(double purchasePrice);
     
}