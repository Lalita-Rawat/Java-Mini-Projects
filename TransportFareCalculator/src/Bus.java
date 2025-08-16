// Subclass: Bus
public class Bus extends Transport {
    public Bus(double distance, double farePerKm) {
        super(distance, farePerKm);
    }

    @Override
    public double calculateFare() {
        // Example: Bus fare may have 10% discount
        return getDistance() * getFarePerKm() * 0.9;
    }
}
