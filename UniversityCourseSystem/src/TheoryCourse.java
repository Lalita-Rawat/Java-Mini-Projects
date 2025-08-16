// Subclass - TheoryCourse
public class TheoryCourse extends Course {
    private int lectureHoursPerWeek;

    public TheoryCourse(String courseCode, int credits, int lectureHoursPerWeek) throws Exception {
        super(courseCode, credits);
        if (lectureHoursPerWeek <= 0) {
            throw new Exception("Lecture hours must be positive");
        }
        this.lectureHoursPerWeek = lectureHoursPerWeek;
    }

    @Override
    public int calculateWorkload() {
        return lectureHoursPerWeek * getCredits();
    }
}
