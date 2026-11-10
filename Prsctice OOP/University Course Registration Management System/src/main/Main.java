
package main;

import model.*;
import management.*;

public class Main {
    public static void main(String[] args) {

        RegistrationOffice office =
            new RegistrationOffice("COMSATS", 3);

        // Creating courses
        Course c1 = new Course(
            "CSC101", "Programming Fundamentals",
            3, CourseLevel.BEGINNER
        );

        Course c2 = new Course(
            "CSC241", "Object Oriented Programming",
            3, CourseLevel.INTERMEDIATE
        );

        Course c3 = new Course(
            "CSC301", "Data Structures",
            4, CourseLevel.ADVANCED
        );

        Course c4 = new Course(
            "MAT101", "Calculus"
        );

        // Creating students
        Student s1 = new Student("Ali", 101);
        Student s2 = new Student("Ahmed", 102);
        Student s3 = new Student("Sara", 103);
        Student s4 = new Student("Usman", 104);

        // Adding students
        System.out.println(
            "Student Added: " + office.addStudent(s1)
        );

        System.out.println(
            "Student Added: " + office.addStudent(s2)
        );

        System.out.println(
            "Student Added: " + office.addStudent(s3)
        );

        System.out.println(
            "Student Added: " + office.addStudent(s4)
        );

        System.out.println();

        // Registering courses
        System.out.println(
            "Registration: " + office.registerCourse(101, c1)
        );

        System.out.println(
            "Registration: " + office.registerCourse(101, c2)
        );

        System.out.println(
            "Registration: " + office.registerCourse(101, c3)
        );

        // Duplicate registration
        System.out.println(
            "Duplicate Registration: " +
            office.registerCourse(101, c1)
        );

        // Registering for Ahmed
        office.registerCourse(102, c4);

        // Non-existing student
        System.out.println(
            "Registration: " + office.registerCourse(999, c1)
        );

        System.out.println();

        office.displayAllStudents();
        office.findStudnet(102);
    }
}
