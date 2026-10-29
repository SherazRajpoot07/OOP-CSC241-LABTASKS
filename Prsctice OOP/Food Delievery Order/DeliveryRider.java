public class DeliveryRider extends Person{
 private String vehicleNumber;
public DeliveryRider(String personId,String name,String vehicleNumber){
 super(personId,name);
 this.vehicleNumber=vehicleNumber;
}
public String getVehicleNumber(){return vehicleNumber;}
@Override
 public void displayInfo(){
   super.displayInfo();
   System.out.println("Vehicle Number:"+vehicleNumber);
}
}
                                                                                                 