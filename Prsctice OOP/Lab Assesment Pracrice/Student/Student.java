public class Student{
  private int studentId;
  private String name;
  private int[] marks;
  private int sum=0;
Student(int studentId, String name, int[] marks){
  this.studentId=studentId;
  this.name=name;
  this.marks=marks;

   }
public int getId(){return studentId;}
public String getName(){return name;}
public int gettotal(){        
         for (int i = 0; i < marks.length; i++) {
            sum+=marks[i];
        }
         return sum;

       }
public void display() {
        System.out.println("Id: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Total: " + gettotal() );
        System.out.println();


}


}