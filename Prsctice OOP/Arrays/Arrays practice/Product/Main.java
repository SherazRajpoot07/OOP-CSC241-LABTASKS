public class Main {
    public static void main(String[] args) {

        int[] sales = {100, 150, 120, 180, 200};
        int[] sales1 = {110, 120, 1230, 140, 150};

        Product p1 = new Product("Laptop", 85000, sales);
        Product p2 = new Product("Printer", 110000, sales1);

        p1.display();
        p2.display();
    }
}