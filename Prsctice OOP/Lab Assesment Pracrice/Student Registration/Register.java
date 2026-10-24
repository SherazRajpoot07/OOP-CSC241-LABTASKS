
public class Register {

    private Student[] students;

    Register(Student[] students) {
        this.students = students;
    }

    public void displayAll() {
        for (int i = 0; i < students.length; i++) {
            students[i].display();
            System.out.println("-------------");
        }
    }

    public Student searchStudent(int id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getId()==id) {
                students[i].display();
            }
            else
                System.out.println("Not found");
        }      
         return null;
       
    }
}
