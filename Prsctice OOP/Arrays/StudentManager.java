
class StudentManager {
    private Student[] students;
    private int count;

    public StudentManager(int capacity) {
        students = new Student[capacity];
        count = 0;
    }

    // Add a student to the array
    public void addStudent(Student s) {
        if (count < students.length) {
            students[count] = s;
            count++;
            System.out.println("Student added successfully.");
        } else {
            System.out.println("Student array is full.");
        }
    }

    // Display all students
    public void displayAll() {
        for (int i = 0; i < count; i++) {
            students[i].display();
        }
    }

    // Search by student ID
    public Student findStudent(String id) {
        for (int i = 0; i < count; i++) {
            if (students[i].getStudentId().equals(id)) {
                return students[i];
            }
        }

        return null;
    }
}
