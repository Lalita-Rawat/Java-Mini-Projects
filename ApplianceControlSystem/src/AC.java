// Subclass - AC
class AC extends Appliance {
    public AC(String brand) throws Exception {
        super(brand);
    }

    @Override
    public void turnOn() throws Exception {
        if (isOn()) throw new Exception("AC is already ON.");
        setOn(true);
        System.out.println(getBrand() + " AC is now ON.");
    }

    @Override
    public void turnOff() throws Exception {
        if (!isOn()) throw new Exception("AC is already OFF.");
        setOn(false);
        System.out.println(getBrand() + " AC is now OFF.");
    }
}
