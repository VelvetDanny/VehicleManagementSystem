// Vehicle.java
public class Vehicle {
    protected int speed; // Protected: Accessible by subclasses
    private double fuel; // Private: Accessible only within this class

    /**
     * Constructor for the Vehicle class.
     * @param speed The initial speed of the vehicle.
     * @param fuel The initial fuel level of the vehicle.
     */
    public Vehicle(int speed, double fuel) {
        this.speed = speed;
        this.fuel = fuel;
        System.out.println("Vehicle created with speed: " + speed + " km/h and fuel: " + fuel + " liters.");
    }

    // Getter and Setter methods for speed
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
        System.out.println("Vehicle speed set to: " + this.speed + " km/h.");
    }

    // Getter and Setter methods for fuel
    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
        System.out.println("Vehicle fuel set to: " + this.fuel + " liters.");
    }

    /**
     * Generic start method for a vehicle. To be overridden by subclasses.
     */
    public void start() {
        System.out.println("Vehicle has started.");
    }

    /**
     * Method to stop the vehicle.
     */
    public void stop() {
        System.out.println("Vehicle has stopped.");
    }

    /**
     * Final method to display the fuel level. Cannot be overridden by subclasses.
     */
    public final void displayFuel() {
        System.out.println("Current fuel level: " + fuel + " liters.");
    }
}
