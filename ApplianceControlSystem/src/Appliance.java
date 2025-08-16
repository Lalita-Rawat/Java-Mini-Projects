// Abstract Class - Appliance Control System
abstract class Appliance {
    private String brand;
    private boolean isOn;

    public Appliance(String brand) throws Exception {
        if (brand == null || brand.trim().isEmpty()) {
            throw new Exception("Brand cannot be null or empty.");
        }
        this.brand = brand;
        this.isOn = false;
    }

    public String getBrand() {
        return brand;
    }

    public boolean isOn() {
        return isOn;
    }

    protected void setOn(boolean on) {
        this.isOn = on;
    }

    public abstract void turnOn() throws Exception;
    public abstract void turnOff() throws Exception;
}

