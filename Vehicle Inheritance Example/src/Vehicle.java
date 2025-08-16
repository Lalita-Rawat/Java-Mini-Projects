// Abstract Class, Encapsulation
public abstract class Vehicle {
    private String brand;
    private int speed; // in km/h

    public Vehicle(String brand, int speed) throws InvalidVehicleDataException {
        if (speed < 0) {
            throw new InvalidVehicleDataException("Speed cannot be negative!");
        }
        this.brand = brand;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) throws InvalidVehicleDataException {
        if (speed < 0) {
            throw new InvalidVehicleDataException("Speed cannot be negative!");
        }
        this.speed = speed;
    }

    // Abstract method
    public abstract void displayDetails();
}
