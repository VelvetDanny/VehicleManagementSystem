// Car.java
public class Car extends Vehicle {
    private int numberOfDoors; // Private: Specific to Car class

    /**
     * Constructor for the Car class.
     * Calls the superclass (Vehicle) constructor and initializes numberOfDoors.
     * @param speed The initial speed of the car.
     * @param fuel The initial fuel level of the car.
     * @param numberOfDoors The number of doors on the car.
     */
    public Car(int speed, double fuel, int numberOfDoors) {
        super(speed, fuel); // Call to Vehicle's constructor
        this.numberOfDoors = numberOfDoors;
        System.out.println("Car created with " + numberOfDoors + " doors.");
    }

    // Getter and Setter methods for numberOfDoors
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
        System.out.println("Car now has " + this.numberOfDoors + " doors.");
    }

    /**
     * Overrides the start method from the Vehicle class.
     * Prints a custom message for a car starting.
     */
    @Override
    public void start() {
        // Optionally call super.start() if you want the generic message too
        // super.start();
        System.out.println("Car engine purrs to life! Ready to drive.");
    }

    /**
     * Unique method for the Car class: honk the horn.
     */
    public void honk() {
        System.out.println("Beep Beep!");
    }
}
