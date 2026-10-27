public class Student extends Person{
 private int regNo;
public Student(String name,int age, int regNo){
 super(name,age);
 this.regNo=regNo;

}

public void displayStudent(){
  super.displayInfo();
  System.out.println("Registration No:"+regNo);
 
 }


}