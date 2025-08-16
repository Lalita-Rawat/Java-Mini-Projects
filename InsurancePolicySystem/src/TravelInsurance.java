// Subclass: TravelInsurance
public class TravelInsurance extends InsurancePolicy {

    public TravelInsurance(String holderName, int age, double coverageAmount) {
        super(holderName, age, coverageAmount);
    }

    @Override
    public double calculatePremium() {
        // Premium = 3% of coverage + age factor
        return getCoverageAmount() * 0.03 + getAge() * 1.5;
    }
}
