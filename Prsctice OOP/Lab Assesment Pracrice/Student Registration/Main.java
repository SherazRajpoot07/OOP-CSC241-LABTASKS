public class Main {
  public static void main(String[] args){
    Student[] students=new Student[3];
    students[0]=new Student(01,"Sheraz","CS");   
    students[1]=new Student(02,"Ali","SE");   
    students[2]=new Student(03,"Ema","BBA");   
    Register reg=new Register(students);
    reg.displayAll();
    reg.searchStudent(02);
    reg.searchStudent(07);
    


 }



}