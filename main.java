public class main{
    public static void main(String[] args){
        
        Vehicle car1 = new Vehicle();
        car1.brand = "Toyota";
        car1.model = "Corolla";
        car1.year = 2018;
        
        Vehicle car2 = new Vehicle();
        car2.brand = "Tesla";
        car2.model = "Model 3";
        car2.year = 2023;
        
        Vehicle car3 = new Vehicle();
        car3.brand = "Ford";
        car3.model = "Mustang";
        car3.year = 1969;
        
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

    }
}