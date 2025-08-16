// Inheritance, Polymorphism
public class Cat extends Animal {
    public Cat(String name) throws InvalidAnimalDataException {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Meow Meow!");
    }
}
