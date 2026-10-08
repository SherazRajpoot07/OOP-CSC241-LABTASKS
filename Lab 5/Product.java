public class Product{

private String id;
private String name;
private double price;
private int quantity;
private static double maxPrice=0;
private static double minPrice=0;
private int count=1;
private Date date;

public Product(String name,double price,int quantity){
   this.id=String.format("p%03d:",count++);
   this.name=name;
   this.price=price;
   this.quantity=quantity;
  if (price>maxPrice)
    {this.maxPrice=price;     
    this.minPrice=maxPrice;}
  if (price<minPrice)
        this.minPrice=price;


}
public Product(String name,double price,int quantity,Date date){
   this.id=String.format("p%03d:",count++);
   this.name=name;
   this.price=price;
   this.quantity=quantity;
  if (price>maxPrice)
    {this.maxPrice=price;     
    this.minPrice=maxPrice;}
  if (price<minPrice)
        this.minPrice=price;
  this.date=date;


}
public void display(){
System.out.println("Date:");
    if (this.date != null) {
        date.displayDate();
    } else {
        System.out.println("No date assigned");
    }
System.out.println("ID:"+id);
System.out.println("Name:"+name);
System.out.println("Price:"+price);
System.out.println("Quantity:"+quantity);
System.out.println("Max value:"+maxPrice);
System.out.println("Min value:"+minPrice);

System.out.println("------------------------------------");


}
}