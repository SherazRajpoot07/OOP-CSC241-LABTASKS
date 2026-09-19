public class Task2Demo {

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        s1.studentId = "BAI001";
        s1.name = "Abeer Amina";
        s1.completedCredits = 30;

        s2.studentId = "BAI002";
       s2.name = "Ali Ishtiaq";
        s2.completedCredits = 40;
         s1.addCredits(5);
        s2.addCredits(10);
          int remaining1 = s1.remainingCredits(130);
        int remaining2 = s2.remainingCredits(130);

       
          System.out.println(s1.summary());
        System.out.println("Remaining Credits: " + remaining1);
       System.out.println();System.out.println(s2.summary());
        System.out.println("Remaining Credits: " + remaining2);
    }
}