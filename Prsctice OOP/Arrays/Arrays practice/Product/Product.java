class Product {
    private String name;
    private double price;
    private int[] monthlySales;
    private int total =0;

    // Constructor
    public Product(String name, double price, int[] sales) {
        this.name = name;
        this.price = price;
        this.monthlySales = sales;
    }
    public double getPrice(){return price;}
    public void setPrice(double price){this.price=price;}
    public int totalSales(){
               for (int i = 0; i < monthlySales.length; i++) {
                    total+=monthlySales[i];
        }
         return total;
 }

    // Display product details and monthly sales
    public void display() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);

        System.out.println("Monthly Sales:");

        for (int i = 0; i < monthlySales.length; i++) {
            System.out.println("Month " + (i + 1) + ": "
                    + monthlySales[i]);
        }
        System.out.println("Total sales: " +totalSales() );
        System.out.println();
    }
}