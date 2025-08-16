// Abstract Class, Encapsulation
public abstract class Animal {
    private String name;

    public Animal(String name) throws InvalidAnimalDataException {
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidAnimalDataException("Animal name cannot be null or empty!");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Abstract method for polymorphism
    public abstract void makeSound();
}
