// Abstract base class: InsurancePolicy
public abstract class InsurancePolicy {
    private String holderName;
    private int age;
    private double coverageAmount;

    public InsurancePolicy(String holderName, int age, double coverageAmount) {
        if (holderName == null || holderName.isEmpty()) {
            throw new IllegalArgumentException("Holder name cannot be empty.");
        }
        if (age <= 0) {
            throw new IllegalArgumentException("Age must be positive.");
        }
        if (coverageAmount <= 0) {
            throw new IllegalArgumentException("Coverage amount must be positive.");
        }

        this.holderName = holderName;
        this.age = age;
        this.coverageAmount = coverageAmount;
    }

    public String getHolderName() {
        return holderName;
    }

    public int getAge() {
        return age;
    }

    public double getCoverageAmount() {
        return coverageAmount;
    }

    public abstract double calculatePremium();
}
