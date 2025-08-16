// Subclass: Taxi
public class Taxi extends Transport {
    public Taxi(double distance, double farePerKm) {
        super(distance, farePerKm);
    }

    @Override
    public double calculateFare() {
        // Example: Taxi fare includes base fare of 50
        return getDistance() * getFarePerKm() + 50;
    }
}
