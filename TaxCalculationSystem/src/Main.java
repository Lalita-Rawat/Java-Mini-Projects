// Main class to test Tax Calculation System
public class Main {
    public static void main(String[] args) {
        try {
            TaxPayer t1 = new Individual("Alice", 50000);
            TaxPayer t2 = new Business("XYZ Corp", 200000);
            TaxPayer t3 = new Freelancer("Bob", 80000);

            System.out.println(t1.getName() + " tax: " + t1.calculateTax());
            System.out.println(t2.getName() + " tax: " + t2.calculateTax());
            System.out.println(t3.getName() + " tax: " + t3.calculateTax());

            // This will throw exception (negative income)
            TaxPayer t4 = new Individual("ErrorCase", -1000);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
