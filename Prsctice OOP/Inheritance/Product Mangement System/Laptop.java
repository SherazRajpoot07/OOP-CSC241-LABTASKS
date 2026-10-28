public class Laptop extends ElectronicProduct {
 private int ramGB;
public Laptop(String name,double price,Date manufacture,int warrantyMonths,int ramGB){
 super(name,price,manufacture,warrantyMonths);
 this.ramGB=ramGB;
}
@Override
public void displayDetails(){
  super.displayDetails();
  System.out.println("RAM GB:"+ramGB);
  System.out.println();
 }


}