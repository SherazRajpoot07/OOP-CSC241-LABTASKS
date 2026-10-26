public class Main {
    public static void main(String[] args) {
        double[] salaries = {45000, 55000, 60000};

        Employee e1 = new Employee(
            101, "Ahmed", Department.FINANCE, salaries
        );

        Employee e2 = new Employee(102, "Usman");

        e1.displayDetails();
        System.out.println();
        e2.displayDetails();
    }
}