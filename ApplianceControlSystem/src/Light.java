// Subclass - Light
class Light extends Appliance {
    public Light(String brand) throws Exception {
        super(brand);
    }

    @Override
    public void turnOn() throws Exception {
        if (isOn()) throw new Exception("Light is already ON.");
        setOn(true);
        System.out.println(getBrand() + " Light is now ON.");
    }

    @Override
    public void turnOff() throws Exception {
        if (!isOn()) throw new Exception("Light is already OFF.");
        setOn(false);
        System.out.println(getBrand() + " Light is now OFF.");
    }
}
