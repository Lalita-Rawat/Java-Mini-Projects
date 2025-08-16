// Subclass - Triangle
public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(String name, double base, double height) throws Exception {
        super(name);
        if (base <= 0 || height <= 0) {
            throw new Exception("Base and height must be positive");
        }
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Triangle with base " + base + " and height " + height);
    }
}
