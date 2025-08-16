// Subclass - Fan
class Fan extends Appliance {
    public Fan(String brand) throws Exception {
        super(brand);
    }

    @Override
    public void turnOn() throws Exception {
        if (isOn()) throw new Exception("Fan is already ON.");
        setOn(true);
        System.out.println(getBrand() + " Fan is now ON.");
    }

    @Override
    public void turnOff() throws Exception {
        if (!isOn()) throw new Exception("Fan is already OFF.");
        setOn(false);
        System.out.println(getBrand() + " Fan is now OFF.");
    }
}
