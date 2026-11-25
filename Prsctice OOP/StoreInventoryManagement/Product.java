
public abstract class Product {

    private String id;
    private String name;
    private double basePrice;

    // Parameterized constructor
    public Product(String id, String name, double basePrice) {
        this.id = id;
        this.name = name;
        this.basePrice = basePrice;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBasePrice() {
        return basePrice;
    }

    // Setter
    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    // Abstract method
    public abstract double calPrice();
}
