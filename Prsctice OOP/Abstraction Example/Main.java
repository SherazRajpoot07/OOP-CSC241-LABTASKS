public class Main{
  public static void main(String args[]){
   // 1. Create CardPayment object
CardPayment card = new CardPayment(2000,"Id-01",01);

// 2. Create BankPayment object
BankPayment bank = new BankPayment(3000,"Id-01","ASKARI");

// 3. Store both objects in Payment array
Payment[] payments = {card, bank};

// 4. Loop through array
for (Payment p : payments) {

    // 5. Runtime polymorphism
    p.processPayment();

    // 6. Display amount
    p.displayAmount();
} 


  }


}