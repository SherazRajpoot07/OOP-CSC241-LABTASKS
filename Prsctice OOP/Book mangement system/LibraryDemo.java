
public class LibraryDemo {
    public static void main(String[] args) {

        Book book1 = new Book(
                201, "Java Programming", 1200,
                BookCategory.PROGRAMMING);

        Book book2 = new Book(
                202, "Database Systems", 1000,
                BookCategory.DATABASE);

        Book book3 = new Book(
                203, "Computer Networks", 900,
                BookCategory.NETWORKING);

        Book book4 = new Book(
                204, "Discrete Mathematics", 800,
                BookCategory.MATHEMATICS);

        Student student = new Student(10, "Ahmed");

        BorrowingRecord record =
                new BorrowingRecord(7001, student);

        record.addBook(book1, 2);
        record.addBook(book2, 1);
        record.addBook(book3, 3);

        record.displayRecord();

        System.out.println("\nSearching for book 202:");
        record.findBook(202);

        System.out.println("\nSearching for book 999:");
        record.findBook(999);
    }
}
