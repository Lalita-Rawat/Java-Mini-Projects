// Main Class: Demonstrates Abstract Class, Inheritance, Polymorphism, Exception Handling
public class Main {
    public static void main(String[] args) {
        try {
            Animal dog = new Dog("Buddy");
            Animal cat = new Cat("Whiskers");
            Animal cow = new Cow("Bessie");

            // Polymorphism: call makeSound() via Animal reference
            makeAnimalSound(dog);
            makeAnimalSound(cat);
            makeAnimalSound(cow);

            // Uncomment to test exception
            // Animal invalidAnimal = new Dog("");

        } catch (InvalidAnimalDataException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Polymorphic method
    public static void makeAnimalSound(Animal animal) {
        animal.makeSound();
    }
}
