// Subclass: LifeInsurance
public class LifeInsurance extends InsurancePolicy {

    public LifeInsurance(String holderName, int age, double coverageAmount) {
        super(holderName, age, coverageAmount);
    }

    @Override
    public double calculatePremium() {
        // Premium = 4% of coverage + age factor
        return getCoverageAmount() * 0.04 + getAge() * 3;
    }
}
