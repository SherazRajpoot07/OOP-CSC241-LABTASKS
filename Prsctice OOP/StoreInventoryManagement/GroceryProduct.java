
public class GroceryProduct extends Product {

    private double discountPercent;

    // Parameterized constructor
    public GroceryProduct(String id, String name,
                          double basePrice,
                          double discountPercent) {

        super(id, name, basePrice);

        this.discountPercent = discountPercent;
    }

    // Overriding abstract method
    @Override
    public double calPrice() {

        return getBasePrice() *
               (1 - discountPercent / 100.0);
    }
}
