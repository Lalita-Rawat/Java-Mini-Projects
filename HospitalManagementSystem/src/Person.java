// Abstract Class, Encapsulation
public abstract class Person {
    private String name;
    private int age;

    public Person(String name, int age) throws InvalidDataException {
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidDataException("Name cannot be null or empty!");
        }
        if (age < 0) {
            throw new InvalidDataException("Age cannot be negative!");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Abstract method
    public abstract void displayDetails();
}
