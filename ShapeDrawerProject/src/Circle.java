// Subclass - Circle
public class Circle extends Shape {
    private double radius;

    public Circle(String name, double radius) throws Exception {
        super(name);
        if (radius <= 0) {
            throw new Exception("Radius must be positive");
        }
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle with radius " + radius);
    }
}
