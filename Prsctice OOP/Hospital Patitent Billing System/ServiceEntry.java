public class ServiceEntry{
 private MedicalService service;
 private int quantity;
public ServiceEntry(MedicalService service, int quantity){
  this.service=service;
  this.quantity=quantity;
 }
public double getSubTotal(){return service.getFee()*quantity;}
public MedicalService getService(){return service;}
public int getQuantity(){return quantity;}

public void displayServiceEntry(){
 System.out.println(service.getName());
 System.out.println("Quantity:"+quantity);
 System.out.println(service.getFee());
 System.out.println(getSubTotal());
 }


}