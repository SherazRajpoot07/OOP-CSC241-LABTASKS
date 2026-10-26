public class Main {
    public static void main(String[] args) {
        Engine e1 = new Engine("Petrol", 150);

        Car c1 = new Car("Civic", "LEA-123");
        Car c2 = new Car("Corolla", "LEB-456", e1);

        c1.displayCar();
        System.out.println();
        c2.displayCar();
    }
}