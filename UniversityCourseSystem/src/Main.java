// Main Class - University Course System
public class Main {
    public static void main(String[] args) {
        try {
            Course theory = new TheoryCourse("CS101", 3, 4);
            Course lab = new LabCourse("CS102L", 2, 3);

            System.out.println(theory.getCourseCode() + " Workload: " + theory.calculateWorkload());
            System.out.println(lab.getCourseCode() + " Workload: " + lab.calculateWorkload());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
