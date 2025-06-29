public class Bicycle extends Vehicle {
    private boolean hasBell; // Private: Specific to Bicycle class

    /**
     * Constructor for the Bicycle class.
     * Calls the superclass (Vehicle) constructor and initializes hasBell.
     * @param speed The initial speed of the bicycle.
     * @param fuel The initial fuel level of the bicycle (can be 0 for bicycles).
     * @param hasBell Whether the bicycle has a bell.
     */
    public Bicycle(int speed, double fuel, boolean hasBell) {
        super(speed, fuel); // Call to Vehicle's constructor
        this.hasBell = hasBell;
        System.out.println("Bicycle created. Has bell: " + hasBell + ".");
    }

    // Getter and Setter methods for hasBell
    public boolean hasBell() {
        return hasBell;
    }

    public void setHasBell(boolean hasBell) {
        this.hasBell = hasBell;
        System.out.println("Bicycle bell status updated to: " + this.hasBell + ".");
    }

    /**
     * Overrides the start method from the Vehicle class.
     * Prints a custom message for a bicycle starting.
     */
    @Override
    public void start() {
        System.out.println("Bicycle starts rolling! Pedal away!");
    }

    /**
     * Unique method for the Bicycle class: ring the bell.
     * Checks if the bicycle has a bell before ringing.
     */
    public void ringBell() {
        if (hasBell) {
            System.out.println("Ring Ring!");
        } else {
            System.out.println("This bicycle does not have a bell.");
        }
    }
}
