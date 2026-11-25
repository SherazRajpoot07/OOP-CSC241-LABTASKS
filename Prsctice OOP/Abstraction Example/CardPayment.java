public class CardPayment extends Payment{
int cardNumber;
public CardPayment( double amount,String transactionId,int cardNumber){
 super(amount,transactionId);
 this.cardNumber=cardNumber;


}
@Override
public void processPayment() {
    System.out.println("Payment processed through Card.");
    System.out.println("Card Number: " + cardNumber);
}


}