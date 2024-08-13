package Lab10;
public class MajorCourse extends Course {
    private int year;

    public MajorCourse(String id, int u, String g, int y) {
        super(id, u, g);
        this.year = y;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return String.format("%s %4d %s  Year %d", getCourseId(), getUnit(), getGrade(), year);
    }
}
