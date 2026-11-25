public class BankPayment extends Payment{
String bankName;
public BankPayment( double amount,String transactionId,String bankName){
 super(amount,transactionId);
 this.bankName=bankName;


}
@Override
public void processPayment() {
    System.out.println("Payment processed through Bank.");
    System.out.println("Bank Name: " + bankName);
}


}