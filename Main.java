public class Main {

    // Helper method for Serviceable interface (outside main)
    public static void performService(Serviceable item) {
        item.service();
    }

    public static void main(String[] args) {

        // 7. Serviceable polymorphic array containing vehicles and a Printer
        System.out.println("=== Serviceable Array Demo ===");
        Serviceable[] serviceableItems = {
            new Car("Toyota", "Corolla", 2018, 4),
            new Motorcycle("Yamaha", "Tmax V3", 2026, "Basta Modagan"),
            new Truck("Ford", "F-150", 2020, 6),
            new Printer()
        };

        for (int i = 0; i < serviceableItems.length; i++) {
            System.out.print("Item " + (i + 1) + " -> ");
            performService(serviceableItems[i]);
        }

        System.out.println();

        // 8. Vehicle polymorphic array testing displayInfo and move methods
        System.out.println("=== Vehicle Array Demo ===");
        Vehicle[] vehicles = {
            new Car("Toyota", "Corolla", 2018, 4),
            new Truck("Ford", "F-150", 2020, 6),
            new Motorcycle("Yamaha", "Tmax V3", 2026, "Basta Modagan")
        };

        for (int i = 0; i < vehicles.length; i++) {
            System.out.println("\n--- Vehicle " + (i + 1) + " ---");
            vehicles[i].displayInfo();
            vehicles[i].moveForward();
            vehicles[i].moveBackwards();
            vehicles[i].moveLeft();
            vehicles[i].moveRight();
        }
    }
}