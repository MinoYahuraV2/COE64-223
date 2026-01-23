package Lab10;
public class GenEdCourse extends Course {

    public GenEdCourse(String id, int u, String g) {
        super(id, u, g);
        System.out.println("Creating GenEdCourse Object");
    }

    @Override
    public String toString() {
        return String.format("%s %4d %s", getCourseId(), getUnit(), getGrade());
    }
}


