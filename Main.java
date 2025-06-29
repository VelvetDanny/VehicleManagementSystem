public class Main {
    public static void main(String[] args) {
        System.out.println("--- Vehicle Management System Test ---");

        // --- Testing Car Object ---
        System.out.println("\n--- Creating and Testing Car ---");
        Car myCar = new Car(60, 45.5, 4); // speed, fuel, numberOfDoors

        // Test methods inherited from Vehicle and overridden in Car
        myCar.start(); // Calls overridden start() in Car
        myCar.displayFuel(); // Calls final displayFuel() in Vehicle
        myCar.stop(); // Calls stop() in Vehicle

        // Test unique method in Car
        myCar.honk();

        // Test getter and setter for Car's unique attribute
        System.out.println("My car has " + myCar.getNumberOfDoors() + " doors.");
        myCar.setNumberOfDoors(2); // Change number of doors
        System.out.println("My car now has " + myCar.getNumberOfDoors() + " doors.");

        // Test getter and setter for inherited protected speed attribute
        System.out.println("My car's current speed: " + myCar.getSpeed() + " km/h.");
        myCar.setSpeed(80);
        System.out.println("My car's new speed: " + myCar.getSpeed() + " km/h.");

        // Test getter and setter for inherited private fuel attribute
        System.out.println("My car's current fuel: " + myCar.getFuel() + " liters.");
        myCar.setFuel(30.0);
        System.out.println("My car's new fuel: " + myCar.getFuel() + " liters.");


        // --- Testing Bicycle Object ---
        System.out.println("\n--- Creating and Testing Bicycle ---");
        Bicycle myBicycle = new Bicycle(15, 0.0, true); // speed, fuel, hasBell

        // Test methods inherited from Vehicle and overridden in Bicycle
        myBicycle.start(); // Calls overridden start() in Bicycle
        myBicycle.displayFuel(); // Calls final displayFuel() in Vehicle
        myBicycle.stop(); // Calls stop() in Vehicle

        // Test unique method in Bicycle
        myBicycle.ringBell(); // Should ring the bell

        // Test getter and setter for Bicycle's unique attribute
        System.out.println("My bicycle has a bell: " + myBicycle.hasBell() + ".");
        myBicycle.setHasBell(false); // Remove the bell
        myBicycle.ringBell(); // Should now say it has no bell

        // Test inherited speed attribute (protected in Vehicle)
        System.out.println("My bicycle's current speed: " + myBicycle.getSpeed() + " km/h.");
        myBicycle.setSpeed(20);
        System.out.println("My bicycle's new speed: " + myBicycle.getSpeed() + " km/h.");

        // Test inherited fuel attribute (private in Vehicle)
        System.out.println("My bicycle's current fuel: " + myBicycle.getFuel() + " liters.");
        myBicycle.setFuel(0.5); // Maybe for a motor-assisted bicycle or just to show setting fuel
        System.out.println("My bicycle's new fuel: " + myBicycle.getFuel() + " liters.");


        // --- Experimenting with different objects ---
        System.out.println("\n--- Experimenting with different objects ---");
        Car sportsCar = new Car(200, 70.0, 2);
        sportsCar.start();
        sportsCar.honk();
        sportsCar.displayFuel();

        Bicycle mountainBike = new Bicycle(25, 0.0, false);
        mountainBike.start();
        mountainBike.ringBell(); // No bell on this one!
        mountainBike.displayFuel();

        // --- Testing access specifiers (compile-time errors if uncommented) ---
        // Uncommenting the lines below will result in compile-time errors,
        // demonstrating that private attributes cannot be accessed directly
        // and protected attributes are accessible in subclasses but not directly from Main
        // (unless Main is in the same package, but generally discouraged for direct access).

        // System.out.println(myCar.fuel); // Error: fuel has private access in Vehicle
        // System.out.println(myCar.numberOfDoors); // Error: numberOfDoors has private access in Car
        // System.out.println(myCar.speed); // Accessible if Main is in the same package as Vehicle, but generally accessed via getter
    }
}
