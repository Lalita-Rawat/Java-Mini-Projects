// Subclass: Freelancer
public class Freelancer extends TaxPayer {

    public Freelancer(String name, double income) {
        super(name, income);
    }

    @Override
    public double calculateTax() {
        return getIncome() * 0.15;
    }
}
