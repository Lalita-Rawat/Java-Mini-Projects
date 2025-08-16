// Main Class: Demonstrates Abstract Class, Inheritance, Exception Handling
public class Main {
    public static void main(String[] args) {
        try {
            Shape s1 = new Circle(5);
            Shape s2 = new Rectangle(4, 6);

            System.out.println(s1.getName() + " Area: " + s1.calculateArea());
            System.out.println(s2.getName() + " Area: " + s2.calculateArea());

            // Uncomment to test exception
            // Shape s3 = new Circle(-3);

        } catch (InvalidShapeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
