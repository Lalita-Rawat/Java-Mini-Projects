// Inheritance
public class Patient extends Person {
    private String illness;

    public Patient(String name, int age, String illness) throws InvalidDataException {
        super(name, age);
        if (illness == null || illness.trim().isEmpty()) {
            throw new InvalidDataException("Illness cannot be null or empty!");
        }
        this.illness = illness;
    }

    public String getIllness() {
        return illness;
    }

    @Override
    public void displayDetails() {
        System.out.println("Patient Name: " + getName() + ", Age: " + getAge() + ", Illness: " + illness);
    }
}
