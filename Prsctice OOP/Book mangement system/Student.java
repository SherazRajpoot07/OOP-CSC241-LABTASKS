public class Student{
 private int studentId;
 private String name;
Student(int studentId,String name){
  this.studentId=studentId;
  this.name=name;

}
public int getStudentId(){return studentId;}
public String getName(){return name;}

public void displayStudent(){
 System.out.println("Student Id:"+studentId);
 System.out.println("Student Name:"+ name);

}

}