package management;
import model.*;

public class RegistrationOffice{
 private String officeName;
 private Student[] students;
 private int studentCount;
public RegistrationOffice(String officeName,int capacity){
 this.officeName=officeName;
 this.students=new Student[capacity];
 

}
public boolean addStudent(Student student){
  for (int i = 0; i < students.length; i++) {
        if (students[i] != null &&
            students[i].getRegNo()==student.getRegNo()) {
            return false;
        }
    }

 for (int i =0;i<students.length;i++){
    if (students[i]==null){
          students[i]=student;
          return true;

}

}
 return false;

}
public Student findStudnet(int regNo){
    for(int i=0;i<students.length;i++){
         if( students[i].getRegNo()==regNo){
              return students[i];
           }
          

}
       
   return null;
}
public boolean registerCourse(int regNo,Course course){
  for(int i=0;i<students.length;i++){
          
         if( students[i].getRegNo()==regNo){
             return students[i].addCourse(course);
          
           }
          

}
 return false;

}
public  void displayAllStudents(){
 System.out.println("========COMSATS============");
   for(int i=0;i<students.length;i++){
      if(students[i]!=null){
       students[i].displayStudent();
       System.out.println();
       
}  

}
       


}


}