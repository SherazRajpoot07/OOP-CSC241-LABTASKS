public class ElectronicProduct extends Product{
 private int warrantyMonths;
public ElectronicProduct(String name,double price,Date manufacture,int warrantyMonths){
 super(name,price,manufacture);
 this.warrantyMonths=warrantyMonths;
  }
public int getWarrantyMonths(){return warrantyMonths;}
@Override
public void displayDetails(){
 super.displayDetails();
System.out.println("Warranty Months:"+warrantyMonths);


}






}