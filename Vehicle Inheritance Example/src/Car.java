// Inheritance
public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, int speed, int numberOfDoors) throws InvalidVehicleDataException {
        super(brand, speed);
        if (numberOfDoors <= 0) {
            throw new InvalidVehicleDataException("Number of doors must be positive!");
        }
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayDetails() {
        System.out.println("Car Brand: " + getBrand() + ", Speed: " + getSpeed() + " km/h, Doors: " + numberOfDoors);
    }
}
