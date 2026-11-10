public class ClinicDesk{
 private String deskName;
 Appointment[] appointments;
 Doctor[] doctors;
 private int countAppointment=0;
 private int countDoctor=0;
public ClinicDesk(String deskName){
 this.deskName=deskName;
 this.appointments=new Appointment[3];
 this.doctors=new Doctor[2];
}
public void addAppointment(Appointment appointment){
 if (countAppointment>=appointments.length){
    System.out.println("Appointments are full.");
    return;
 }
  for (int i=0;i<appointments.length;i++){
     if(appointments[i]==null){
        appointments[i]=appointment;
        countAppointment++;
         return;
}
}
}
 
public void addDoctor(Doctor doctor){
 if (countDoctor>=doctors.length){
    System.out.println("Doctor is not available.");
    return;
 }
  for (int i=0;i<doctors.length;i++){
     if(doctors[i]==null){
        doctors[i]=doctor;
        countDoctor++;
         return;
}
}
}
public void displayDesk(){
 System.out.println("Desk Name:"+deskName);
 System.out.println("Appointments list:");
 for (int i=0;i<appointments.length;i++){
   if (appointments[i]!=null){
       appointments[i].displayAppointment();
       System.out.println();
}
}
 System.out.println("Doctors list:");
 for (int i=0;i<doctors.length;i++){
   if (doctors[i]!=null){
      doctors[i].displayInfo();
       System.out.println();
}
}



}
 

}