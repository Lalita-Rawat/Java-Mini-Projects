// Base class: Transport
public abstract class Transport {
    private double distance; // in km
    private double farePerKm;

    public Transport(double distance, double farePerKm) {
        if (distance < 0) {
            throw new IllegalArgumentException("Distance cannot be negative.");
        }
        if (farePerKm < 0) {
            throw new IllegalArgumentException("Fare per km cannot be negative.");
        }
        this.distance = distance;
        this.farePerKm = farePerKm;
    }

    public double getDistance() {
        return distance;
    }

    public double getFarePerKm() {
        return farePerKm;
    }

    public abstract double calculateFare();
}
