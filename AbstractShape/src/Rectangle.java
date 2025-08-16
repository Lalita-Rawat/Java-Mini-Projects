// Inheritance
public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) throws InvalidShapeException {
        super("Rectangle");
        if (length < 0 || width < 0) {
            throw new InvalidShapeException("Length and Width must be non-negative!");
        }
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) throws InvalidShapeException {
        if (length < 0) {
            throw new InvalidShapeException("Length cannot be negative!");
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) throws InvalidShapeException {
        if (width < 0) {
            throw new InvalidShapeException("Width cannot be negative!");
        }
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}
