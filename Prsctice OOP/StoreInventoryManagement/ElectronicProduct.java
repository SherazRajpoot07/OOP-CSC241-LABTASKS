
public class ElectronicProduct extends Product {

    private double warrantyCharge;

    // Four-parameter constructor
    public ElectronicProduct(String id, String name,
                             double basePrice,
                             double warrantyCharge) {

        super(id, name, basePrice);

        this.warrantyCharge = warrantyCharge;
    }

    // Three-parameter constructor
    public ElectronicProduct(String id, String name,
                             double basePrice) {

        this(id, name, basePrice, 0.0);
    }

    // Overriding abstract method
    @Override
    public double calPrice() {

        return getBasePrice() * 1.10 + warrantyCharge;
    }
}
