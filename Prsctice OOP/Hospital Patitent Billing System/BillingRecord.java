public class BillingRecord{
 private int billNo;
 private Patient patient;
 private ServiceEntry[] entries;
 private int entryCount;
public BillingRecord(int billNo,Patient patient){
  this(billNo,patient,5) ;
 }
public BillingRecord(int billNo,Patient patient,int capacity ){
  this.billNo=billNo;
  this.patient=patient;
  this.entries=new ServiceEntry[capacity];
  this.entryCount=0;

}
public void addService(MedicalService service, int quantity){
 if (quantity<0){
  System.out.println("Qunatity should be positive");
  }
  if (quantity>=entries.length){
  System.out.println("Order is full");
 }
entries[entryCount]=new ServiceEntry(service,quantity);
entryCount++;

}
public void findService(int serviceId){
  for(int i=0;i<entryCount;i++){
     if (entries[i].getService().getServiceId()==serviceId){
       System.out.print("Service Found:");
       System.out.println(entries[i].getService().getName()+"|Quantity:"+entries[i].getQuantity());
       return;
 }
 }
System.out.println("Service not found");
}
public double calculateTotal(){
 double total=0;
 for(int i=0;i<entryCount;i++){
   total+=entries[i].getSubTotal();  
 }
 return total;

}
public void displayBill(){
 System.out.println("-----------------------------------------");
 System.out.println("          HOSPITAL BILLING RECRD");
 System.out.println("-----------------------------------------");
 System.out.println("Bill No:"+billNo);
 patient.displayPatient();
 System.out.println("Service"+" "+ "Qty"+" "+"Fee"+" "+"Subtotal");
 for (int i=0;i<entryCount;i++){
    entries[i].displayServiceEntry();
}
System.out.println("Total Bill:"+calculateTotal());








}










}