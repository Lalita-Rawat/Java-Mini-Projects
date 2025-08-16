// Subclass - Square
public class Square extends Shape {
    private double side;

    public Square(String name, double side) throws Exception {
        super(name);
        if (side <= 0) {
            throw new Exception("Side length must be positive");
        }
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Square with side " + side);
    }
}
