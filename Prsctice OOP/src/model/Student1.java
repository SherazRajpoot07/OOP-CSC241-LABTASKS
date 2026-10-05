package model;
public class Student1{

 private String id;
 private String name;
 private double gpa;
 private int age;



public Student1(String id,String name,double gpa,int age){

this.id=id;
this.name=name;
this.gpa=gpa;
this.age=age;

}
public void setName(String name){this.name=name;}
public String getName(){return name;}
public String getId(){return id;}
public void setAge(int age){
 if (age>=15&&age<=60)
    this.age=age;
 else
    System.out.println("Invalid age");
}
public int getAge(){return age;}
public void setGpa(double gpa){
 if (gpa>=0.0&&gpa<=4.0)
    this.gpa=gpa;
 else 
   System.out.println("Invalid gpa");
}
public double getGpa(){return gpa;}
 public void display(){
 System.out.println("Id:"+id);
 System.out.println("Name:"+name);
 System.out.println("Gpa:"+gpa);
 System.out.println("Age:"+age);

}






}