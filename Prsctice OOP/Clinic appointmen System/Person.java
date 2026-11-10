public class Person{
 private int personId;
 private String name;
public Person(int personId,String name){
   this.personId=personId;
   this.name=name;

 }
public int getPersonId(){return personId;}
public String getName(){return name;}
public void displayInfo(){
 System.out.println("Person Id:"+personId);
 System.out.println("Name:"+name);
}


}