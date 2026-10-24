public class OrderItem{
  private FoodItem item;
  private int quantity;

public OrderItem(FoodItem item,int quantity){
 this.item=item;
 this.quantity=quantity;

}
public double getSubTotal(){return item.getPrice()*quantity;}
public int getQuantity(){return quantity;}
public FoodItem getItem() {
        return item;
    }
public void displayOrderItem(){
System.out.println(item.getName());
System.out.println( "Quantity :"+quantity);
System.out.println(item.getPrice());
System.out.println(getSubTotal());



}
}