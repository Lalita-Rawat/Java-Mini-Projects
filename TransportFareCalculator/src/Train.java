// Subclass: Train
public class Train extends Transport {
    public Train(double distance, double farePerKm) {
        super(distance, farePerKm);
    }

    @Override
    public double calculateFare() {
        // Example: Train fare may have 5% surcharge for reservation
        return getDistance() * getFarePerKm() * 1.05;
    }
}
