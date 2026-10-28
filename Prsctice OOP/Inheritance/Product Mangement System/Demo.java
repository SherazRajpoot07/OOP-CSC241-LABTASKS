public class Demo{
 public static void main(String[] args){
 Date d1=new Date(07,10,2005);
 Date d2=new Date(27,10,2026);
 Product p1=new Product("Laptop",80000,d1);
 ElectronicProduct e1=new ElectronicProduct("Laptop",80000,d1,12);
 ClothingProduct c1=new ClothingProduct("Kurta",30000,d2,"Medium");
 Laptop l1= new Laptop("Laptop",80000,d1,12,32);
 p1.displayDetails();
 e1.displayDetails();
 c1.displayDetails();
 l1.displayDetails();
 
 

 
}


}