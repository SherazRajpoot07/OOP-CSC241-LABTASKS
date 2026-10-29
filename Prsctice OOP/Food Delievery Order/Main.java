public class Main{
 public static void main(String[] args){
   Customer c1=new Customer("01","Sheraz","Ravi Road Lahore");
   DeliveryRider r1=new DeliveryRider("02","Eman","Timber Market");
   FoodOrder o1=new  FoodOrder("011",c1,"19",1500);
   FoodOrder o2=new  FoodOrder("011",c1,"20",2000);
   DeliveryDesk d1=new  DeliveryDesk("Fast Food");
   d1.addOrder(o1);
   d1.addOrder(o2);
   d1.addRider(r1);
   d1.displayDesk();
}

}