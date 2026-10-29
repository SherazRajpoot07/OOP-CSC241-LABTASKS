public class FoodOrder{
 private String orderId;
 private Customer customer;
 private Bill bill;
public FoodOrder(String orderId,Customer customer,String billNumber,double totalAmount){
 this.orderId=orderId;
 this.customer=customer;
 this.bill=new Bill(billNumber,totalAmount);
 
} 
public void displayOrder(){
  System.out.println("Order Id:"+orderId);
  System.out.println("Customer:");
  customer.displayInfo();
  System.out.println("Bill:");
  bill.displayBill();
 
 
  

}


 
}