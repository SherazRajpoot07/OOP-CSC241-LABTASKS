
import java.util.ArrayList;

public class StoreManagement implements CRUD {

    private final ArrayList<Product> products =
            new ArrayList<>();

    // Add product
    @Override
    public boolean addProduct(Product product) {

        if (findProduct(product.getId()) != null) {
            return false;
        }

        products.add(product);
        return true;
    }

    // Find product
    @Override
    public Product findProduct(String id) {

        for (Product p : products) {

            if (p.getId().equals(id)) {
                return p;
            }
        }

        return null;
    }

    // Update product
    @Override
    public boolean updateProduct(String id,
                                  double newBasePrice) {

        Product p = findProduct(id);

        if (p == null) {
            return false;
        }

        p.setBasePrice(newBasePrice);
        return true;
    }

    // Delete product
    @Override
    public boolean deleteProduct(String id) {

        for (int i = 0; i < products.size(); i++) {

            if (products.get(i).getId().equals(id)) {

                products.remove(i);
                return true;
            }
        }

        return false;
    }

    // Display all products
    public void displayAllProducts() {

        System.out.println("\n----- INVENTORY -----");

        for (Product p : products) {

            System.out.println("ID: " + p.getId());
            System.out.println("Name: " + p.getName());

            System.out.printf("Base Price: Rs. %.2f%n",
                    p.getBasePrice());

            System.out.printf("Calculated Price: Rs. %.2f%n",
                    p.calPrice());

            System.out.println("----------------------");
        }
    }

    // Calculate total inventory value
    public double totalInventoryValue() {

        double total = 0;

        for (Product p : products) {

            total += p.calPrice();
        }

        return total;
    }

    // Main assignment workflow
    public void run() {

        System.out.println("STORE INVENTORY MANAGEMENT");

        // STEP 1: Create and add four products

        addProduct(new ElectronicProduct(
                "E101", "Laptop", 100000, 2000));

        addProduct(new ElectronicProduct(
                "E102", "Mouse", 2000, 100));

        addProduct(new GroceryProduct(
                "G201", "Rice", 3000, 5));

        addProduct(new GroceryProduct(
                "G202", "Milk", 400, 5));

        System.out.println("\nSTEP 1: Initial Inventory");

        displayAllProducts();

        System.out.println("Product Count: " + products.size());


        // STEP 2: Find G201

        System.out.println("\nSTEP 2: Find Product G201");

        Product found = findProduct("G201");

        if (found != null) {

            System.out.println("Product Found!");
            System.out.println("ID: " + found.getId());
            System.out.println("Name: " + found.getName());

            System.out.printf("Price: Rs. %.2f%n",
                    found.calPrice());
        }


        // STEP 3: Update G201 price

        System.out.println("\nSTEP 3: Update G201");

        if (updateProduct("G201", 3500)) {

            System.out.println("Price Updated Successfully!");

            Product updated = findProduct("G201");

            System.out.printf("New Calculated Price: Rs. %.2f%n",
                    updated.calPrice());
        }


        // STEP 4: Delete E102

        System.out.println("\nSTEP 4: Delete E102");

        if (deleteProduct("E102")) {

            System.out.println("Product Deleted Successfully!");
        }

        displayAllProducts();


        // STEP 5: Attempt duplicate ID

        System.out.println("\nSTEP 5: Duplicate ID Check");

        Product duplicate = new ElectronicProduct(
                "E101", "Tablet", 50000, 1000);

        if (addProduct(duplicate)) {

            System.out.println("Product Added!");
        } else {

            System.out.println("Duplicate ID! Product Rejected.");
        }


        // STEP 6: Attempt to delete missing product

        System.out.println("\nSTEP 6: Delete X999");

        if (deleteProduct("X999")) {

            System.out.println("Product Deleted!");
        } else {

            System.out.println("Product X999 Not Found!");
        }


        // STEP 7: Final inventory count and total

        System.out.println("\nSTEP 7: Final Inventory");

        System.out.println("Product Count: " + products.size());

        System.out.printf("Total Inventory Value: Rs. %.2f%n",
                totalInventoryValue());


        // STEP 8: Demonstrate this() constructor chaining

        System.out.println("\nSTEP 8: Constructor Chaining");

        ElectronicProduct e103 = new ElectronicProduct(
                "E103", "USB Cable", 800);

        System.out.println("Product: " + e103.getName());

        System.out.printf("Calculated Price: Rs. %.2f%n",
                e103.calPrice());
    }
}
