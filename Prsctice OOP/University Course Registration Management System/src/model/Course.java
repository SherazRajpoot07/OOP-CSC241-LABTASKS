package model;

public class Course{
 private String courseCode;
 private String courseName;
 private int creditHours;
 private CourseLevel level;
public Course(String courseCode,String courseName){
  this(courseCode,courseName,3,CourseLevel.BEGINNER);
  
}
public Course(String courseCode,String courseName,int creditHours,CourseLevel level){
  this.courseCode=courseCode;
  this.courseName=courseName;
  if (creditHours<0){
     System.out.println("Credit Hours should be positive");   
}
  else
  this.creditHours=creditHours;
  this.level=level;
}
public String getCourseCode(){return courseCode;}
public int getCreditHours(){return creditHours;}
public void displayCourse(){
 System.out.printf("%s,%5s,%5d,%5s",courseCode,courseName,creditHours,level);
 
 }


}