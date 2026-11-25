class Student extends UniversityMember
                 implements Examinable, Payable {

    private int semester;
    private double fee;

    public Student(int id, String name, int semester, double fee) {
        super(id, name);
        this.semester = semester;
        this.fee = fee;
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Student");
    }

    @Override
    public void takeExam() {
        System.out.println(name + " is taking the exam");
    }

    @Override
    public void submitExam() {
        System.out.println(name + " has submitted the exam");
    }

    @Override
    public void calculateFee() {
        System.out.println("Total fee: " + fee);
    }

    @Override
    public void payFee() {
        System.out.println(name + " has paid the fee");
    }
}