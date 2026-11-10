public class Main{
 public static void main(String [] args){
  Patient p1=new Patient(001,"Maham",20);
  Doctor d1=new Doctor(1,"Irha","Liver specialize");
  Doctor d2=new Doctor(2,"Ema","Hear specialize");
  Appointment a1=new Appointment(17,p1,98,1000);
  Appointment a2=new Appointment(19,p1,99,2000);
  ClinicDesk cd1=new ClinicDesk("Heart and Liver");
  cd1.addAppointment(a1);
  cd1.addAppointment(a2);
  cd1.addDoctor(d1);
  cd1.addDoctor(d2);
  cd1.displayDesk();
  



}


}