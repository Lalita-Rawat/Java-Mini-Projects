// Abstract Class, Encapsulation
public abstract class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Abstract method for area calculation
    public abstract double calculateArea();
}
