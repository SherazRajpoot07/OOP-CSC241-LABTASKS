public class Product{
 private String name;
 private double price;
 private int quantity;
public Product(String name){this(name,0,0);}
public Product(String name,double price,int quantity){
 this.name=name;
 if (price >= 0 && quantity >= 0) {
    this.price = price;
    this.quantity = quantity;
}
}
public String getName(){return name;}
public double getPrice(){return price;}
public int getQuantity(){return quantity;}

public double calculateBill(){
 return price*quantity;
 }
public double calculateBill(double discount) {
    return calculateBill()-((calculateBill() / 100)* discount);
}
public void displayBill(){
 System.out.println("Product:"+name);
 System.out.println("Original Bill:"+calculateBill());
 System.out.println("Discounted Bill:"+calculateBill(10));
}


}