package model;
public class Student{
 private String name;
 private int regNo;
 private Course[]courses;
 private int countCourse;
public Student(String name,int regNo){
 this(name,regNo,new Course[3]);
}
public Student(String name,int regNo,Course[]courses){
 this.name=name;
 this.regNo=regNo;
 this.courses=courses;
 this.countCourse=0;


} 
public int getRegNo(){return regNo;}
public boolean addCourse(Course course) {

    // Check duplicate course
    for (int i = 0; i < courses.length; i++) {
        if (courses[i] != null &&
            courses[i].getCourseCode().equals(course.getCourseCode())) {
            return false;
        }
    }

    // Find empty position
    for (int i = 0; i < courses.length; i++) {
        if (courses[i] == null) {
            courses[i] = course;
            countCourse++;
            return true;
        }
    }

    return false;
}
public boolean addCourse(Course course, boolean allowDuplicate) {

    if (!allowDuplicate) {
        return addCourse(course);
    }

    // Allow duplicates, but check for an empty position
    for (int i = 0; i < courses.length; i++) {
        if (courses[i] == null) {
            courses[i] = course;
            countCourse++;
            return true;
        }
    }

    return false; // Array is full
}
public int calculateTotalCredits(){
   int totalCreditHours=0;
   for (int i=0;i<courses.length;i++){
        if (courses[i]!=null){
           totalCreditHours+=courses[i].getCreditHours();
}
 }
 return totalCreditHours;

}
public int countCourses(){
  return countCourse;
 
}
public void displayStudent(){

System.out.printf("Student Name:%s%n",name);
System.out.printf("Registration No:%d%n",regNo);
System.out.println("Courses:");
for (int i=0;i<courses.length;i++){
 if(courses[i]!=null){
   courses[i].displayCourse();
   System.out.println();
}

}
System.out.printf("Total courses:%d%n",countCourses());
System.out.printf("Total Credit Hours:%d%n",calculateTotalCredits());







}



}