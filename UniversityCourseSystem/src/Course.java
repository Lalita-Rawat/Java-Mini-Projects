// Abstract Class - Course
public abstract class Course {
    private String courseCode;
    private int credits;

    public Course(String courseCode, int credits) throws Exception {
        if (courseCode == null || courseCode.isEmpty()) {
            throw new Exception("Course code cannot be null or empty");
        }
        if (credits <= 0) {
            throw new Exception("Credits must be positive");
        }
        this.courseCode = courseCode;
        this.credits = credits;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public int getCredits() {
        return credits;
    }

    public abstract int calculateWorkload();
}
