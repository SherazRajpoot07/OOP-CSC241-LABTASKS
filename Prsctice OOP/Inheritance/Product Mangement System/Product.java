public class Product{
 private static int nextId=1;
 private static final String ID_SUFFIX="-PRD";
 private final String id;
 private String name;
 private double price;
 private Date manufacture;

public Product(String name,double price,Date manufacture){
 this.id = nextId + ID_SUFFIX;
 nextId++;
 this.name=name;
 this.price=price;
 this.manufacture=manufacture;

}
public String getName(){return name;}
public double getPrice(){return price;}
public Date getDate(){return manufacture;}
public String  getId(){return id;}
 public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Product: " + name);
        System.out.println("Price: Rs. " + price);

        System.out.print("Manufacturing date: ");
        manufacture.displayDate();
    }



}