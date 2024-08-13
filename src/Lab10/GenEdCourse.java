package Lab10;
public class GenEdCourse extends Course {

    public GenEdCourse(String id, int u, String g) {
        super(id, u, g);
    }

    @Override
    public String toString() {
        return String.format("%s %4d %s", getCourseId(), getUnit(), getGrade());
    }
}


