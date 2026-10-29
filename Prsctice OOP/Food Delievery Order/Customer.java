public class Customer extends Person{
 private String address;
public Customer(String personId,String name,String address){
  super(personId,name);
  this.address=address;
 }
public String getAddress(){return address;}
@Override
public void displayInfo(){
 super.displayInfo();
 System.out.println("Address:"+address);

}

}