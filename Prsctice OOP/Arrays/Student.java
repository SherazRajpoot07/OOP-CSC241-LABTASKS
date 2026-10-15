
class Student {
    private String studentId;
    private String name;
    private int completedCredits;

    public Student(String studentId, String name, int completedCredits) {
        this.studentId = studentId;
        this.name = name;
        this.completedCredits = completedCredits;
    }

    // Getters
    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getCompletedCredits() {
        return completedCredits;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCompletedCredits(int completedCredits) {
        this.completedCredits = completedCredits;
    }

    // Add credits
    public void addCredits(int credits) {
        completedCredits += credits;
    }

    // Calculate remaining credits
    public int remainingCredits(int totalCredits) {
        return totalCredits - completedCredits;
    }

    // Display student information
    public void display() {
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Completed Credits: " + completedCredits);
        System.out.println("----------------------");
    }
}
