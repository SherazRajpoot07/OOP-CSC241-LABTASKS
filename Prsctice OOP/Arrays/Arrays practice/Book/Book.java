public class Book{

 private String id;
 private String title;

 public Book(String id,String title){
   this.id=id;
   this.title=title;

}
public void setId(String id){this.id=id;}
public String getId(){return id;}
public String getTitle(){return title;}

public void display(){
 
  System.out.println("Id:"+id);
  System.out.println("Title:"+title);
 

}



}