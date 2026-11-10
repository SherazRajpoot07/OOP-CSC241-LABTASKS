public class Patient extends Person{
 private int age;
public Patient(int personId,String name,int age){
 super(personId,name);
 this.age=age;
}
public int getAge(){return age;}
@Override
public void displayInfo(){
  super.displayInfo();
  System.out.println("Age:"+age);
}

}