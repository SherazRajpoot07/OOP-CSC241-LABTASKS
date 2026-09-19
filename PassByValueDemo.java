class PassByValueDemo {

    // Experiment A
    static void changeNumber(int x) {

        System.out.println("Inside method before: " + x);
          x = 99;
        System.out.println("Inside method after: " + x);
    }
       // Experiment B
    static void changeStudent(Student st) {
       System.out.println("Inside method before: "
                + st.completedCredits);
           st.completedCredits = 99;

        System.out.println("Inside method after: "
                + st.completedCredits);
    }

        // Experiment C
    static void replaceStudent(Student st) {

          st = new Student();
 
         st.name = "Temporary";
        st.completedCredits = 500;

           System.out.println("Inside method: "
                + st.name + " " + st.completedCredits);
    }

    public static void main(String[] args) {
  
          // Experiment A
        System.out.println("EXPERIMENT A");

        int number = 10;

          System.out.println("Before method: " + number);

        changeNumber(number);
  
          System.out.println("After method: " + number);


           // Experiment B
        System.out.println("\nEXPERIMENT B");

         Student student = new Student();

        student.name = "Ali";
        student.completedCredits = 20;

        System.out.println("Before method: "
                + student.completedCredits);

        changeStudent(student);

          System.out.println("After method: "
                + student.completedCredits);


        // Experiment C
        System.out.println("\nEXPERIMENT C");

        Student student2 = new Student();

        student2.name = "Abeer";
        student2.completedCredits = 30;

        System.out.println("Before method: "
                + student2.name + " "
                + student2.completedCredits);

          replaceStudent(student2);

        System.out.println("After method: "
                 + student2.name + " "
                 + student2.completedCredits);
    }
}