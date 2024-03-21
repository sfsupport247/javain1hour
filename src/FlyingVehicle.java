public class FlyingVehicle {
    // Public attribute
    public String name;

    // Protected attribute
    protected double altitude;

    // Default attribute
    int speed;

    // Private attribute
    private String manufacturer;

    // Public method
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Altitude: " + altitude);
        System.out.println("Speed: " + speed);
        System.out.println("Manufacturer: " + manufacturer);
    }
}
