public class Demo {
    public static void main(String[] args) {
        
        Date d1 = new Date(15, 10, 2026);
        Date d2 = new Date(7,10,2026); 

      
        Product p1 = new Product("Laptop", 1200.50, 5, d1);
        p1.display();

        
        Product p2 = new Product("Mouse", 25.00, 10);
        p2.display(); // Safe: handles date == null without throwing NullPointerException

        
        Product p3 = new Product("Keyboard", 85.00, 3, d2);
        p3.display();
    }
}