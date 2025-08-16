// Subclass: Archer
public class Archer extends Character {
    public Archer(String name, int health, String weapon) {
        super(name, health, weapon);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " (Archer) shoots arrows with " + getWeapon() + " hitting targets from distance!");
    }
}
