// Main Class: Demonstrates Polymorphism, Inheritance, Exception Handling
public class Main {
    public static void main(String[] args) {
        try {
            Employee emp1 = new Manager("Alice", 101, 50000, 10000);
            Employee emp2 = new Developer("Bob", 102, 40000, 5000);

            emp1.displayInfo();
            System.out.println("Total Salary: " + emp1.calculateSalary());

            emp2.displayInfo();
            System.out.println("Total Salary: " + emp2.calculateSalary());

            // Uncomment to test exception
            // Employee emp3 = new Manager("Charlie", 103, -45000, 5000);

        } catch (InvalidSalaryException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
