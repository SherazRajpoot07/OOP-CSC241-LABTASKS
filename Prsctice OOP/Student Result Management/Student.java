public class Student{
 private String name;
 private int[] marks;
 private Grade grade;
public Student(String name){
  this.name=name;
}
public Student(String name, int[]marks){
 this.name=name;
 this.marks=marks;
 }
public double calculateAverage(){
 double total=0;
for (int i=0;i<marks.length;i++){
    total+=marks[i];
 }
double Average=total/marks.length; 
return Average;
}
public Grade getGrade(){
  double result=calculateAverage();
 if (result>=80)
    return Grade.A;
 else if(result>=70)
    return Grade.B;
 else if(result>=60)
   return Grade.C;
 else if(result>=60)
    return Grade.D;
 else
    return Grade.F;

}
public void displayResult(){
 System.out.println("Name:"+name);
 System.out.println("Average:"+calculateAverage());
 System.out.println("Grade:"+getGrade());
 System.out.println();


}




}