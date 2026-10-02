public class Student{
 private String id;
 private String name;
 private String email;
 private String city;
 private Date dob;
 
public Student(String name,String email){
 this(name,email,"nyc");
}
public Student(String name,String email,String city){
this(name,email,city,new Date());
} 
public Student(String name,String email,String city,Date dob){
this.name=name;
this.email=email;
this.city=city;
this.dob=dob;
} 
void display(){
System.out.println("Id:sp26-bai-037");
System.out.println("Name:"+name);
System.out.println("Email:"+email);
System.out.println("City:"+city);
dob.displayDate();



}


}