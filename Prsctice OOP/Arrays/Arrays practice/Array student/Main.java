public class Main{
  public static void main(String[] args) {

        Student[] students = new Student[3];

        students[0] = new Student("S01");
        students[1] = new Student("S02", "Ali");
        students[2] = new Student("S03", "Ahmed", 20);

       for (int i = 0; i < students.length; i++) {
        students[i].display();
        System.out.println();
}
    }

}