package app;
import model.Student1;
public class Test2{
 public static void main(String args[]){
  Student1 s1=new Student1("sp26-bai","Ali",2.4,21);
  Student1 s2=new Student1("sp26-bai","Ali",2.4,21);
  s1.setName("Sheraz");
  s1.setGpa(3.41);
  s1.setAge(21);
  s1.display();
  System.out.println();
  s2.setName("Maham");
  s2.setGpa(3.97);
  s2.setAge(20);
  s2.display();




}




}