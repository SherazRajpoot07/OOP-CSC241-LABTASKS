public class PaymentReceipt{
 private int receiptNumber;
 private double amount;
public PaymentReceipt(int receiptNumber,double amount){
 this.receiptNumber=receiptNumber;
 this.amount=amount;
}
public int getReceiptNumber(){return receiptNumber;}
public double getAmount(){return amount;}
public void displayReceipt(){
 System.out.println("Receipt Number:"+receiptNumber);
 System.out.println("Receipt Amount:"+amount);
 
}

}