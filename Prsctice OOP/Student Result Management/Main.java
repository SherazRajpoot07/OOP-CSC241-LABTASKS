public class Main {
    public static void main(String[] args) {
        int[] marks1 = {80, 90, 70};
        int[] marks2 = {45, 50, 40};

        Student s1 = new Student("Ali", marks1);
        Student s2 = new Student("Sara");

        s2 = new Student("Sara", marks2);

        s1.displayResult();
        s2.displayResult();
    }
}