// Abstract base class: Character
public abstract class Character {
    private String name;
    private int health;
    private String weapon;

    public Character(String name, int health, String weapon) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        if (health <= 0) {
            throw new IllegalArgumentException("Health must be positive.");
        }
        if (weapon == null || weapon.isEmpty()) {
            throw new IllegalArgumentException("Weapon cannot be empty.");
        }

        this.name = name;
        this.health = health;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setHealth(int health) {
        if (health < 0) {
            throw new IllegalArgumentException("Health cannot be negative.");
        }
        this.health = health;
    }

    public abstract void attack();
}
