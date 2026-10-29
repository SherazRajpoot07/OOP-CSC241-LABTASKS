public class Main{
 public static void main(String [] args){
 LibraryItem l1=new LibraryItem("1@","TAMANA","001","1");
 LibraryItem l2=new LibraryItem("2@","ZINDAGI","002","2");
 LibraryItem l3=new LibraryItem("3@","LOVE YOU TILL DEATH","003","3");
 LibraryItem l4=new LibraryItem("4@","MISSING YOU","004","4");
 Book b1=new Book("1@","TAMANA","001","1","Rehman");
 Book b2=new Book("2@","ZINDAGI","002","2","Sheraz");
 Magzine m1=new Magzine("3@","LOVE YOU TILL DEATH","003","3",1552);
 Magzine m2=new Magzine("4@","MISSING YOU","004","4",1557);
 LibrarySection s1=new LibrarySection("Random Books");
 
 l1.displayInfo();
  s1.addItem(b1);
  s1.addItem(b2);
  s1.addItem(m1);
  s1.addItem(m2);
  s1.displayItems();

}

}