public class BorrowedBook{
 private Book book;
 private int quantity;
BorrowedBook(Book book,int quantity){
  this.book=book;
  this.quantity=quantity;
 
}
public double getSubTotal(){return book.getPrice()*quantity;}
public int getQuantity(){return quantity;}
public Book getBook(){return book;}

public void displayBorrowedBook(){

 System.out.println(book.getTitle());
 System.out.println("Quantity:"+quantity); 
 System.out.println(book.getPrice());
 System.out.println(getSubTotal());




}





}