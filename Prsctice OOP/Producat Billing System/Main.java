public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("Keyboard", 2000, 2);
        Product p2 = new Product("Mouse");

        p1.displayBill();
        System.out.println();
        System.out.println("Default Product: " + p2.calculateBill());
    }
}