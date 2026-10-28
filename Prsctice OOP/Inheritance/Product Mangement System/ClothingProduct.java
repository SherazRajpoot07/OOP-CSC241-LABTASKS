public class ClothingProduct extends Product{
 private String size;
public ClothingProduct(String name,double price,Date manufacture,String size){
 super(name,price,manufacture);
 this.size=size;
}
@Override
public void displayDetails(){
 super.displayDetails();
 System.out.println("Product size:"+size);
}


}