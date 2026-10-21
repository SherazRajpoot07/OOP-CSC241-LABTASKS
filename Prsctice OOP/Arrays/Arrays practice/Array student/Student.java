public class Student{
 
  private String id;
  private String name;
  private int age;


public Student(String id){this(id,"Default",0);}
public Student(String id ,String name){this(id,name,0);}
public Student(String id, String name,int age){
   this.id=id;
   this.name=name;
   this.age=age;
}
public String getId(){return id;}
public String getName(){return name;}
public int getAge(){return age;}
  
public void display() {
    System.out.println("Id: " + id);
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
}






 

}