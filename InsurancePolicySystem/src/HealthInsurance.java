// Subclass: HealthInsurance
public class HealthInsurance extends InsurancePolicy {

    public HealthInsurance(String holderName, int age, double coverageAmount) {
        super(holderName, age, coverageAmount);
    }

    @Override
    public double calculatePremium() {
        // Premium = 5% of coverage + age factor
        return getCoverageAmount() * 0.05 + getAge() * 2;
    }
}
