// Inheritance
public class Circle extends Shape {
    private double radius;

    public Circle(double radius) throws InvalidShapeException {
        super("Circle");
        if (radius < 0) {
            throw new InvalidShapeException("Radius cannot be negative!");
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws InvalidShapeException {
        if (radius < 0) {
            throw new InvalidShapeException("Radius cannot be negative!");
        }
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
