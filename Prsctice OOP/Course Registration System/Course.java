public class Course{
 private String courseName;
 private int creditHours;
 private Level level;
public Course(String courseName,int creditHours,Level level){
 this.courseName=courseName;
 this.creditHours=creditHours;
 this.level=level;

}
public String getCourseName(){return courseName;}
public int getCreditHours(){return creditHours;}
public Level getLevel(){return level;}
public void displayCourse(){
 System.out.printf("%s -%d - %s",courseName,creditHours,level);
 

 } 




}