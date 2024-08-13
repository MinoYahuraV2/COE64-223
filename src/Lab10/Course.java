package Lab10;
public class Course {
    private String courseID;
    private int unit;
    private String grade;

    public Course() {
        this.courseID = "";
        this.unit = 0;
        this.grade = "";
    }

    public Course(String id, int u, String g) {
        this.courseID = id;
        this.unit = u;
        this.grade = g;
    }

    public String getCourseId() {
        return courseID;
    }

    public int getUnit() {
        return unit;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return String.format("%s %4d %s", courseID, unit, grade);
    }

    // Method to get grade point for GPA calculation
    public double getGradePoint() {
        return switch (grade) {
            case "A" -> 4.0;
            case "B+" -> 3.5;
            case "B" -> 3.0;
            case "C+" -> 2.5;
            case "C" -> 2.0;
            case "D+" -> 1.5;
            case "D" -> 1.0;
            default -> 0.0; // Includes W and F
        };
    }
}
