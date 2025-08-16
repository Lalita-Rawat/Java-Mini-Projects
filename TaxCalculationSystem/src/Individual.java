// Subclass: Individual
public class Individual extends TaxPayer {

    public Individual(String name, double income) {
        super(name, income);
    }

    @Override
    public double calculateTax() {
        return getIncome() * 0.10;
    }
}
