// Subclass - LabCourse
public class LabCourse extends Course {
    private int labHoursPerWeek;

    public LabCourse(String courseCode, int credits, int labHoursPerWeek) throws Exception {
        super(courseCode, credits);
        if (labHoursPerWeek <= 0) {
            throw new Exception("Lab hours must be positive");
        }
        this.labHoursPerWeek = labHoursPerWeek;
    }

    @Override
    public int calculateWorkload() {
        return labHoursPerWeek * getCredits();
    }
}
