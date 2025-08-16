// Main class to test Loan Processing System
public class Main {
    public static void main(String[] args) {
        try {
            Loan[] loans = {
                new HomeLoan(500000, 7.5, 15),
                new CarLoan(800000, 9.0, 5),
                new EducationLoan(300000, 6.0, 4)
            };

            for (Loan l : loans) {
                System.out.println(
                    l.getClass().getSimpleName() + " Interest: Rs " + l.calculateInterest()
                );
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
