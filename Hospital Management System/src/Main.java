// Main Class: Demonstrates Abstract Class, Inheritance, Exception Handling
public class Main {
    public static void main(String[] args) {
        try {
            Person doctor = new Doctor("Dr. Smith", 45, "Cardiology");
            Person patient = new Patient("John Doe", 30, "Flu");

            doctor.displayDetails();
            patient.displayDetails();

            // Uncomment to test exception
            // Person invalidDoctor = new Doctor("", 40, "Neurology");

        } catch (InvalidDataException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
