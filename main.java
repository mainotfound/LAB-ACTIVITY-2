public class main {
    public static void main(String[] args) {

        Vehicle car1 = new Vehicle("Toyota", "Corolla", 2018);
        Vehicle car2 = new Vehicle("Tesla", "Model 3", 2023);
        Vehicle car3 = new Vehicle("Ford", "Mustang", 1969);

        System.out.println("--- Vehicle 1 ---");
        car1.displayInfo();
        System.out.println("Age: " + car1.calculateAge() + " years");
        System.out.println("Is Vintage? " + car1.isVintage());

        System.out.println();

        System.out.println("--- Vehicle 2 ---");
        car2.displayInfo();
        System.out.println("Age: " + car2.calculateAge() + " years");
        System.out.println("Is Vintage? " + car2.isVintage());

        System.out.println();

        System.out.println("--- Vehicle 3 ---");
        car3.displayInfo();
        System.out.println("Age: " + car3.calculateAge() + " years");
        System.out.println("Is Vintage? " + car3.isVintage());

        System.out.println();
        System.out.println("--- Testing Getters ---");
        System.out.println("Brand: " + car1.getBrand());
        System.out.println("Model: " + car1.getModel());
        System.out.println("Year: " + car1.getYear());

        System.out.println();
        System.out.println("--- Testing setYear ---");

        System.out.println("setYear(2000): " + car1.setYear(2000));
        System.out.println("Year: " + car1.getYear());
        System.out.println("Age: " + car1.calculateAge());
        System.out.println("Vintage: " + car1.isVintage());

        System.out.println("setYear(1885): " + car1.setYear(1885));
        System.out.println("Year: " + car1.getYear());

        System.out.println("setYear(2027): " + car1.setYear(2027));
        System.out.println("Year: " + car1.getYear());

        System.out.println();
        System.out.println("--- Testing Constructor Validation ---");

        Vehicle oldCar = new Vehicle("Ford", "Model T", 1885);
        System.out.println("New vehicle with year 1885");
        System.out.println("Initial year: " + oldCar.getYear());

        Vehicle futureCar = new Vehicle("Tesla", "Model S", 2027);
        System.out.println("New vehicle with year 2027");
        System.out.println("Initial year: " + futureCar.getYear());
    }
}