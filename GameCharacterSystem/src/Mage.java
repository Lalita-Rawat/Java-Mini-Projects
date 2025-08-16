// Subclass: Mage
public class Mage extends Character {
    public Mage(String name, int health, String weapon) {
        super(name, health, weapon);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " (Mage) casts a spell with " + getWeapon() + " causing magical damage!");
    }
}
