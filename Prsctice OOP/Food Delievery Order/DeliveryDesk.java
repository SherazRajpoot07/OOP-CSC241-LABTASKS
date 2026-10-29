public class DeliveryDesk {
    private String deskName;
    private int orderCount=0;
    private int riderCount=0;
  
    private FoodOrder[] orders = new FoodOrder[3];
    private DeliveryRider[] riders = new DeliveryRider[2];
 public DeliveryDesk(String deskName) {
        this.deskName = deskName;
    }

public void addOrder(FoodOrder order){
  if(orderCount>=orders.length){
   System.out.println("Order is full.");
    return;
}
   for(int i=0;i<orders.length;i++){
     if(orders[i]==null){
       orders[i]=order;
       orderCount++;
       return;
       
         
  }
 }
}
public void addRider(DeliveryRider rider){
  if(riderCount>=riders.length){
   System.out.println("Riders are full.");
    return;
}
   for(int i=0;i<riders.length;i++){
     if(riders[i]==null){
       riders[i]=rider;
       riderCount++;
       return;
       
         
  }
 }
}
public void displayDesk(){
 System.out.println("Desk Name:"+deskName);
 System.out.println("Food Order Details:");
 for(int i=0;i<orders.length;i++){
   if(orders[i]!=null){
      orders[i].displayOrder();
      System.out.println();   
}


}
 System.out.println("Rider Details:");
 for(int i=0;i<riders.length;i++){
   if(riders[i]!=null){
      riders[i].displayInfo();
      System.out.println();   
}


}

 

}
}


