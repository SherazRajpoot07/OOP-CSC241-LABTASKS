public class Doctor extends Person{
 private String specialization;
public Doctor(int personId,String name,String specialization){
 super(personId,name);
  this.specialization=specialization;
}
public String getSpecialization(){return specialization;}
@Override
public void displayInfo(){
 super.displayInfo();
 System.out.println("Doctor specialization:"+specialization);

}


}