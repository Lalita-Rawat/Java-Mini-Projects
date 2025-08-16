// Inheritance, Polymorphism
public class Cow extends Animal {
    public Cow(String name) throws InvalidAnimalDataException {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Moo Moo!");
    }
}
