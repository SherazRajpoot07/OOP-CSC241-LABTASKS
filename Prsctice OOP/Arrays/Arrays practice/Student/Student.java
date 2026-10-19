public class Student{
   private String name; 
   private int[] marks;
   private int sum=0;
 
public Student(String name,int []marks){
   this.name=name;
   this.marks=marks;

    }
public int gettotal(){        
         for (int i = 0; i < marks.length; i++) {
            sum+=marks[i];
        }
         return sum;

       }
public void display() {
        System.out.println("Name: " + name);

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        System.out.println("Total: " + gettotal() );
        System.out.println();

}


       

}