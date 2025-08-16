// Main Class: Demonstrates Polymorphism, Encapsulation, Exception Handling
public class Main {
    public static void main(String[] args) {
        try {
            Calculator calc = new Calculator();

            System.out.println("Add (int): " + calc.add(5, 3));
            System.out.println("Add (double): " + calc.add(2.5, 4.8));

            System.out.println("Subtract (int): " + calc.subtract(10, 4));
            System.out.println("Multiply (double): " + calc.multiply(3.5, 2.0));

            System.out.println("Divide (int): " + calc.divide(8, 2));

            // Uncomment to test division by zero
            // System.out.println(calc.divide(5, 0));

        } catch (InvalidCalculationException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
