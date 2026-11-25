public class Main{
 public static void main(String []args){
  UniversityMember[]objects={
    new Student(037,"Sheraz",2,168000),
    new Teacher(02,"Ali","Chemistry")

  };
  for(UniversityMember u:objects){
     u.displayRole();
     u.displayDetails();
     if(u instanceof Student){
        Student s=(Student)u;
        s.takeExam();
        s.payFee();

     }

  }




 }

}