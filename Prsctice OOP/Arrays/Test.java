
public class Test {
    public static void main(String[] args) {

        StudentManager manager = new StudentManager(3);

        Student s1 = new Student("S101", "Ali", 30);
        Student s2 = new Student("S102", "Sara", 45);
        Student s3 = new Student("S103", "Ahmed", 60);

        manager.addStudent(s1);
        manager.addStudent(s2);
        manager.addStudent(s3);

        System.out.println("\nAll Students:");
        manager.displayAll();

        // Search for a student
        Student result = manager.findStudent("S102");

        if (result != null) {
            System.out.println("Student Found:");
            result.display();

            // Update using a method
            result.addCredits(3);

            System.out.println("After Adding Credits:");
            result.display();
        } else {
            System.out.println("Student not found.");
        }

        // Use a setter and getter
        s1.setName("Ali Khan");
        System.out.println("Updated Name: " + s1.getName());

        System.out.println(
            "Remaining Credits: " + s1.remainingCredits(130)
        );
    }
}
