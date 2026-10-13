public class Student{

private String id;
private String name;
private String city;
private String email;
private double gpa;
private Date date;
private static int count=1; 
private static String university = "COMSATS";
private static int totalStudents;

public Student(){
 this.id=String.format("SP26%03d:",count++);
 this.name=null;
 this.city="Lahore";
 this.email="email@gmail";
 this.gpa=0.0;
 this.date=null;
 university="COMSATS";
 this.totalStudents=totalStudents++;
 }
public Student(String name,String email){
 this.id=String.format("SP26%03d:",count++);
 this.name=name;
 this.city="Lahore";
 this.email=email;
 this.gpa=0.0;
 this.date=null;
 university="COMSATS";
 this.totalStudents=totalStudents++;
 }
public Student(String name,String email,Date date){
 this.id=String.format("SP26%03d:",count++);
 this.name=name;
 this.city="Lahore";
 this.email=email;
 this.gpa=0.0;
 this.date=date;
 university="COMSATS";
 this.totalStudents=totalStudents++;
 }
public Student(String name,String email,String city, double gpa, Date date){
 this.id=String.format("SP26%03d:",count++);
 this.name=name;
 this.city=city;
 this.email=email;
 this.gpa=gpa;
 this.date=date;
 university="COMSATS";
 this.totalStudents=totalStudents++;
 }
public void setName(String name){ this.name=name;}
public void setCity(String city){ this.city=city;}
public void setEmail(String email){ this.email=email;}
public void setGpa(double gpa){ 
  if (gpa>=0.0&&gpa<=4.0)
     this.gpa=gpa;
  else 
   System.out.println("Invalid gpa..");

}
public String getString(){ return name;}
public String getId(){return id;}
public String getCity(){return city;}
public String getEmail(){return email;}
public Double getGpa(){return gpa;}
public static String getUniversity() {  return university;}
public static int getTotalStudents() { return totalStudents;}

public void display(){
System.out.println("Date:");
    if (this.date != null) {
        date.displayDate();
    } 
     else {
        System.out.println("No date assigned");
    }
System.out.println("ID:"+id);
System.out.println("Name:"+name);
System.out.println("Emial:"+email);
System.out.println("City:"+city);
System.out.println("Gpa:"+gpa);
System.out.println("University:"+university);
System.out.println("Total students:"+totalStudents);

System.out.println("------------------------------------");


}




}
      


