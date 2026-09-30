public class Demo{

 public static void main(String args[]){

    Cart n1=new Cart();
    //Task 2
    n1.addItem(120);
    n1.addItem(50,3);
    System.out.println("Total before invlaid call="+n1.getTotal());
    //Task 3
   n1.addItem(-10);
    n1.addItem(10,0);
   System.out.println("Total after invlid call="+n1.getTotal());  
 




}

}