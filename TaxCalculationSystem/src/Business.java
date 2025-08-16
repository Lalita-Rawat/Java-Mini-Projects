// Subclass: Business
public class Business extends TaxPayer {

    public Business(String name, double income) {
        super(name, income);
    }

    @Override
    public double calculateTax() {
        return getIncome() * 0.25;
    }
}
