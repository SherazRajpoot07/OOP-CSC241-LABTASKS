public class Cart {
    private double total; 
  
   /* public double addItem(double price){
       if (price > 0) total += price;      // this is invlid because the signature of two methods cannot be same
    }*/

    public void addItem(double price) {
        if (price > 0) total += price;
    }

     void addItem(double price, int quantity){
 
       if (price>0 && quantity>0)
         
           total+=price*quantity;


}
    public double getTotal() { return total; }
}