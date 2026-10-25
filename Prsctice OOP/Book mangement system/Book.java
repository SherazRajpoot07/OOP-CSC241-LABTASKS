public class Book{
 private int bookId;
 private String title;
 private double price;
 BookCategory category;
public Book(int bookId,String title,double price){
   this(bookId,title,price,BookCategory.PROGRAMMING);
 } 
public Book(int bookId,String title,double price,BookCategory category){
   this.bookId=bookId;
   this.title=title;
   this.price=price;
   this.category=category;

}
public int getBookId(){return bookId;}
public String getTitle(){return title;}
public double getPrice(){return price;}
public BookCategory getCategory(){return category;}

public void displayBook(){
 System.out.println("Book Id:"+bookId);
 System.out.println("Title:"+title);
 System.out.println("Price:"+price);
 System.out.println("Category:"+category);


}

}