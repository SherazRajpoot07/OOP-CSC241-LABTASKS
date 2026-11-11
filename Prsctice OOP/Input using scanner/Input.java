import java.util.Scanner;
public class Input{
 public static void main(String []args){
 final String  university="COMSATS";
 Scanner input=new Scanner(System.in);
 
 System.out.println("Enter your name:");
 String name=input.nextLine();
 System.out.println("Enter your age:");
 int age=input.nextInt();
 System.out.println("Enter your CGPA:");
  double cgpa=input.nextDouble();
 System.out.println("Enter your Grade:");
  char grade=input.next().charAt(0);
  System.out.printf("University:%s%nName:%s%nAge:%d%nCGPA:%f%nGrade:%c%n",university,name,age,cgpa,grade);

 





}


}