public class Appointment{
 private int appointmentId;
 private Patient patient;
 private PaymentReceipt receipt;
public Appointment(int appointmentId,Patient patient,int receiptNumber,double amount){
  this.appointmentId=appointmentId;
  this.patient=patient;
  this.receipt=new PaymentReceipt(receiptNumber,amount);
 
}
public int getAppointmentId(){return appointmentId;}
public Patient getPatient(){return patient;}
public PaymentReceipt getReceipt(){return receipt;}
public void displayAppointment(){
 System.out.println("Appointment Id:"+appointmentId);
 System.out.println("Patient Detail:"+patient);
 System.out.println("Payment Detail:"+receipt);
 
}
}