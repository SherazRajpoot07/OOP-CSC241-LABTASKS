abstract class UniversityMember{
 protected int id;
 protected String name;

public UniversityMember(int id, String name){
 this.id=id;
 this.name=name;

} 
abstract void displayRole();
public void displayDetails(){

System.out.println("ID:"+id);
System.out.println("Name:"+name);


}


}