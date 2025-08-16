// Polymorphism (Method Overloading), Encapsulation
public class Calculator {
    private double lastResult;

    public Calculator() {
        this.lastResult = 0;
    }

    public double getLastResult() {
        return lastResult;
    }

    public void setLastResult(double result) {
        this.lastResult = result;
    }

    // Overloaded Add Methods
    public double add(int a, int b) {
        lastResult = a + b;
        return lastResult;
    }

    public double add(double a, double b) {
        lastResult = a + b;
        return lastResult;
    }

    // Overloaded Subtract Methods
    public double subtract(int a, int b) {
        lastResult = a - b;
        return lastResult;
    }

    public double subtract(double a, double b) {
        lastResult = a - b;
        return lastResult;
    }

    // Overloaded Multiply Methods
    public double multiply(int a, int b) {
        lastResult = a * b;
        return lastResult;
    }

    public double multiply(double a, double b) {
        lastResult = a * b;
        return lastResult;
    }

    // Overloaded Divide Methods with Exception Handling
    public double divide(int a, int b) throws InvalidCalculationException {
        if (b == 0) {
            throw new InvalidCalculationException("Division by zero is not allowed!");
        }
        lastResult = (double) a / b;
        return lastResult;
    }

    public double divide(double a, double b) throws InvalidCalculationException {
        if (b == 0) {
            throw new InvalidCalculationException("Division by zero is not allowed!");
        }
        lastResult = a / b;
        return lastResult;
    }
}
