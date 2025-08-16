// Inheritance
public class Doctor extends Person {
    private String specialization;

    public Doctor(String name, int age, String specialization) throws InvalidDataException {
        super(name, age);
        if (specialization == null || specialization.trim().isEmpty()) {
            throw new InvalidDataException("Specialization cannot be null or empty!");
        }
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    @Override
    public void displayDetails() {
        System.out.println("Doctor Name: " + getName() + ", Age: " + getAge() + ", Specialization: " + specialization);
    }
}
