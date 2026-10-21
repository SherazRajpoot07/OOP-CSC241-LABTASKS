public class Test{
  public static void main(String[]args){
    Book books[]=new Book[4];
    books[0]=new Book("12@","The Ravi Story");
    books[1]=new Book("13@","Taj Mahal");
    books[2]=new Book("14@","The Great Babar Azam");
    books[3]=new Book("15@","Love until i die");
    String searchid="14@";
    
     for (int i = 0; i < books.length; i++) {
        if (books[i].getId().equals(searchid)){
            books[i].setId("56@");
            books[i].display();
            System.out.println();
}
}
}



}