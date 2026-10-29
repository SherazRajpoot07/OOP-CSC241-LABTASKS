public class Person{
 private String personId;
 private String name;
public Person(String personId,String name){
 this.personId=personId;
 this.name=name;
 
 }
public String getPersonId(){return personId;}
public String getName(){return name;}
public void displayInfo(){
 System.out.println("Person Id:"+personId);
 System.out.println("Name:"+name);
 

 }

}