abstract class Payment{
 double amount;
 String transactionId;
 public Payment(double amount,String transactionId){
   this.amount=amount;
   this.transactionId=transactionId;

 }
 
 abstract void processPayment();
 void displayAmount(){
   System.out.println("Amount:"+amount);

 }




}