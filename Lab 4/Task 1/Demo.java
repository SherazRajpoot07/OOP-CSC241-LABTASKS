public class Demo{
 public static void main(String args[]){

  Student s1=new Student("Sheraz","email@gmail.com");
  Student s2=new Student("Sheraz","email@gmail.com","Lahore");
  Student s3=new Student("Sheraz","email@gmail.com","Karachi",new Date(07,10,2005));
  s1.display();
  System.out.println();
  s2.display();
  System.out.println();
  s3.display();



}




}