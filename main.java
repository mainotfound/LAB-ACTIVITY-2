public class main {
    public static void main(String[] args) {
 
        Vehicle[] vehicles = {
            new Vehicle("Toyota", "Corolla", 2018),
            new Vehicle("Tesla", "Model 3", 2023),
            new Vehicle("Ford", "Mustang", 1969)
        };
 
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println("--- Vehicle " + (i + 1) + " ---");
            vehicles[i].displayInfo();
            System.out.println("Age: " + vehicles[i].calculateAge() + " years");
            System.out.println("Is Vintage? " + vehicles[i].isVintage());
            System.out.println();
        }
    }
}
 
