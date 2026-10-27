public class Student{
 private String name;
 private int regNo;
 private Course[]courses;
public Student(String name,int regNo){
 this(name,regNo,new Course[3]);
}
public Student(String name,int regNo,Course[]courses){
 this.name=name;
 this.regNo=regNo;
 this.courses=courses;

}
public boolean addCourse(Course course) {
    for (int i = 0; i < courses.length; i++) {
        if (courses[i] == null) {
            courses[i] = course;
            return true;
        }
    }
    return false;
}

public int calculateTotalCredits() {
    int total = 0;

    for (int i = 0; i < courses.length; i++) {
        if (courses[i] != null) {
            total += courses[i].getCreditHours();
        }
    }

    return total;
}
public void displayCourses(){
 System.out.println("Name:"+name);
 System.out.println("Registration No:"+regNo);
 System.out.println("Cousres:");
 for(int i=0;i<courses.length;i++){
  if(courses[i]!=null)
    courses[i].displayCourse();
    System.out.println();
  }
 System.out.println("Total credits:"+calculateTotalCredits());
 

}




}