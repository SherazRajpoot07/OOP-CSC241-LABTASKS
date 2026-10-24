public class Order {
    private int orderNo;
    private Customer customer;
    private OrderItem[] items;
    private int itemCount;

    // Default capacity is 5
    public Order(int orderNo, Customer customer) {
        this(orderNo, customer, 5);
    }

    public Order(int orderNo, Customer customer, int capacity) {
        this.orderNo = orderNo;
        this.customer = customer;
        this.items = new OrderItem[capacity];
        this.itemCount = 0;
    }

    public void addItem(FoodItem item, int quantity) {
        if (quantity <= 0) {
            System.out.println("Quantity must be positive.");
            return;
        }

        if (itemCount >= items.length) {
            System.out.println("Order is full.");
            return;
        }

        items[itemCount] = new OrderItem(item, quantity);
        itemCount++;

        System.out.println(item.getName() + " added to order.");
    }

    public void findItem(int itemCode) {
        for (int i = 0; i < itemCount; i++) {
            if (items[i].getItem().getItemCode() == itemCode) {
                System.out.println("Item Found: "
                        + items[i].getItem().getName()
                        + " | Quantity: "
                        + items[i].getQuantity());
                return;
            }
        }

        System.out.println("Item not found");
    }

    public double calculateTotal() {
        double total = 0;

        for (int i = 0; i < itemCount; i++) {
            total += items[i].getSubTotal();
        }

        return total;
    }

    public void displayOrder() {
        System.out.println("============================================");
        System.out.println("             CAFETERIA ORDER");
        System.out.println("============================================");
        System.out.println("Order No: " + orderNo);
        customer.displayCustomer();

        System.out.println("--------------------------------------------");
        System.out.printf("%-20s %3s %8s %10s%n",
                "Item", "Qty", "Price", "Subtotal");

        for (int i = 0; i < itemCount; i++) {
            items[i].displayOrderItem();
        }

        System.out.println("--------------------------------------------");
        System.out.printf("Total Bill: Rs. %.0f%n", calculateTotal());
    }
}