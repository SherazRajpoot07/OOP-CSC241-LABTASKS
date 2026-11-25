public class Teacher extends UniversityMember{
 private String subject;
public Teacher(int id, String name,String subject){
 super(id,name);
 this.subject=subject;

}
public void displayRole(){
    System.out.println("Role: Teacher");
}
@Override
public void displayDetails(){
  super.displayDetails();
  System.out.println("Subject:"+subject);


}


}

