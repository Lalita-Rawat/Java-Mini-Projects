// Inheritance, Polymorphism
public class Dog extends Animal {
    public Dog(String name) throws InvalidAnimalDataException {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Woof Woof!");
    }
}
