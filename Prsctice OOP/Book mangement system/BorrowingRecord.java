public class BorrowingRecord{
 private int recordNo;
 private Student student;
 private BorrowedBook[] books;
 private int bookCount;
BorrowingRecord(int recordNo,Student student){
  this(recordNo,student,5);
 } 
BorrowingRecord(int recordNo,Student student,int capacity){
  this.recordNo=recordNo;
  this.student=student;
  this.books=new BorrowedBook[capacity];
  this.bookCount=0;
 } 
public void addBook(Book book,int quantity ){
 if (quantity <= 0) {
            System.out.println("Quantity must be positive.");
            return;
        }

        if (bookCount >= books.length) {
            System.out.println("Order is full.");
            return;
        }

        books[bookCount] = new BorrowedBook(book, quantity);
        bookCount++;

        System.out.println(book.getTitle() + " added to order.");

}
public void findBook(int bookId){
 for (int i = 0; i < bookCount; i++) {
            if (books[i].getBook().getBookId() == bookId) {
                System.out.println("Item Found: "
                        + books[i].getBook().getTitle()
                        + " | Quantity: "
                        + books[i].getQuantity());
                return;
            }
        }

        System.out.println("Item not found");

}
public double getTotal(){
  double total = 0;

        for (int i = 0; i < bookCount; i++) {
            total += books[i].getSubTotal();
        }

        return total;
 
}
public void displayRecord(){
 System.out.println("============================================");
        System.out.println("             LIBRARY BORROWING RECORD");
        System.out.println("============================================");
        System.out.println("Record No: " + recordNo);
        student.displayStudent();

        System.out.println("--------------------------------------------");
        System.out.printf("%-20s %3s %8s %10s%n",
                "Item", "Qty", "Price", "Subtotal");

        for (int i = 0; i < bookCount; i++) {
            books[i].displayBorrowedBook();
        }

        System.out.println("--------------------------------------------");
        System.out.printf("Total Bill: Rs. %.0f%n", getTotal());
    }


}