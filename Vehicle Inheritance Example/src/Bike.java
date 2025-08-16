// Inheritance
public class Bike extends Vehicle {
    private boolean hasGear;

    public Bike(String brand, int speed, boolean hasGear) throws InvalidVehicleDataException {
        super(brand, speed);
        this.hasGear = hasGear;
    }

    @Override
    public void displayDetails() {
        System.out.println("Bike Brand: " + getBrand() + ", Speed: " + getSpeed() + " km/h, Has Gear: " + hasGear);
    }
}
