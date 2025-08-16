// Subclass: Warrior
public class Warrior extends Character {
    public Warrior(String name, int health, String weapon) {
        super(name, health, weapon);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " (Warrior) attacks with " + getWeapon() + " dealing heavy damage!");
    }
}
