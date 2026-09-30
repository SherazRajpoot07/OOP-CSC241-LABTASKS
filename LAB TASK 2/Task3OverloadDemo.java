public class Task3OverloadDemo {

        // Signature: enroll(String)
          void enroll(String courseCode) {
        System.out.println("Enrolled in course: " + courseCode);
    }

     // Signature: enroll(String, int)
      void enroll(String courseCode,int section ) {
      System.out.println("Enrolled in " + courseCode
                + ", Section: " + section);
    }

     // Signature: enroll(int)
         void enroll(int numericCourseCode) {
        System.out.println("Enrolled in numeric course: "
                + numericCourseCode);
    }

    /*
      // INVALID OVERLOAD

    int enroll(String courseCode) {
        return 1;
    }
     //signature methods depend on data types inisde parameter;

    The compiler does not allow this because
    return type alone cannot create an overload.
    */

    public static void main(String[] args) {

        Task3OverloadDemo obj = new Task3OverloadDemo();

        // Valid calls
        obj.enroll("CSC241");

        obj.enroll("CSC241", 2);

        obj.enroll(241);

        /*
        // Invalid call: no matching method
        obj.enroll(); 
        it has no papameter so it is invalid call;

        // Invalid call: no method accepts String, String
        obj.enroll("241", "2");
       
        */
    }
}