public class Main {
    public static void main(String[] args) {
        Course c1 = new Course("OOP", 3, Level.HARD);
        Course c2 = new Course("English", 3, Level.EASY);
        Course c3 = new Course("Discrete Math", 3, Level.MEDIUM);
        Course c4 = new Course("Physics", 4, Level.HARD);

        Student s1 = new Student("Ali", 101);

        s1.addCourse(c1);
        s1.addCourse(c2);
        s1.addCourse(c3);

        System.out.println("Course Added: " + s1.addCourse(c4));
        s1.displayCourses();
    }
}