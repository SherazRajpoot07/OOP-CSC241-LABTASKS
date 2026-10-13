public class Test{
 public static void main(String[] args){

   Date d1=new Date(10,2026);
   Date d2=new Date(10,10,2026);
   Student s1=new Student();
   Student s2=new Student("Sheraz","email0@gmail.com",d1);
   Student s3=new Student("ALi","email1@gmail.com",d2);
   s1.setName("Farhan");
   
   
   s1.display();
   s2.display();
   s3.display();



}







}