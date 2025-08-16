// Main Class - Shape Drawer
public class Main {
    public static void main(String[] args) {
        try {
            Shape[] shapes = new Shape[3];
            shapes[0] = new Circle("MyCircle", 5);
            shapes[1] = new Square("MySquare", 4);
            shapes[2] = new Triangle("MyTriangle", 6, 3);

            for (Shape s : shapes) {
                System.out.print(s.getName() + ": ");
                s.draw();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
