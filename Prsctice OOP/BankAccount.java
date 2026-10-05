public class BankAccount{

 private String accountNumber;
 private String ownerName;
 private Double balance;


 BankAccount(String accountNumber,String ownerName,double balance){

  this.accountNumber=accountNumber;
  this.ownerName=ownerName;
  this.balance=balance;


}

public void setOwnerName(String name){this.ownerName=name;
} 
public String getOwnerName(){
 
 return ownerName;
}
public double getbalance(){
 
 return balance;
}
public String getAccountNumber(){
 
 return accountNumber;
}
public void deposit(double amount)
{
 if (amount>0)
  { balance+=amount;
 System.out.println("Amount is successfully deposit!");
  }
else 
 System.out.println("Amount is invalid!");
}
public void withdraw(double amount)
{
 if (amount<=balance)
  {balance-=amount;
 System.out.println("Amount is successfully withdraw!");
  }
 else 
 System.out.println("Amount is invalid!");
}
public void display(){
System.out.println("Account Number:"+accountNumber);
System.out.println("Owner Name:"+ownerName);
System.out.println("Balance:"+balance);


}


}