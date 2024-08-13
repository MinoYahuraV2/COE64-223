package Lab10;
public class CourseCheck {

    public static void displayCourse(Course[] c) {
        int generalEdCount = 0;
        int majorCourseCount = 0;

        System.out.println("General Education Course :");
        for (Course course : c) {
            if (course instanceof GenEdCourse) {
                System.out.println(course);
                generalEdCount++;
            }
        }

        int generalEdPass = calPassSubject(c, GenEdCourse.class);
        System.out.printf("Enroll: %d Pass: %d%n", generalEdCount, generalEdPass);
        System.out.println("=======================");

        System.out.println("Major Course :");
        for (Course course : c) {
            if (course instanceof MajorCourse) {
                System.out.println(course);
                majorCourseCount++;
            }
        }

        int majorCoursePass = calPassSubject(c, MajorCourse.class);
        System.out.printf("Enroll: %d Pass: %d%n", majorCourseCount, majorCoursePass);
        System.out.println("=======================");

        double gpa = calGpa(c);
        System.out.printf("GPA: %.2f%n", gpa);
        System.out.println("=======================");
    }

    // Method to count pass subjects
    public static int calPassSubject(Course[] c, Class<?> courseType) {
        int passCount = 0;
        for (Course course : c) {
            if (courseType.isInstance(course)) {
                String grade = course.getGrade();
                if (!grade.equals("W") && !grade.equals("F")) {
                    passCount++;
                }
            }
        }
        return passCount;
    }

    // Method to calculate GPA excluding grades of W
    public static double calGpa(Course[] c) {
        double totalPoints = 0.0;
        int totalUnits = 0;

        for (Course course : c) {
            int units = course.getUnit();
            String grade = course.getGrade();
            
            // Only include courses that are not W in the GPA calculation
            if (!grade.equals("W")) {
                totalUnits += units;
                totalPoints += course.getGradePoint() * units;
            }
        }

        return (totalUnits == 0) ? 0.0 : totalPoints / totalUnits;
    }

    // Method to change the grade of a subject
    public static void changeGrade(Course[] c, String id, String grade) {
        for (int i = 0; i < c.length; i++) {
            if (c[i].getCourseId().equals(id)) {
                if (c[i] instanceof MajorCourse) {
                    c[i] = new MajorCourse(id, c[i].getUnit(), grade, ((MajorCourse) c[i]).getYear());
                } else if (c[i] instanceof GenEdCourse) {
                    c[i] = new GenEdCourse(id, c[i].getUnit(), grade);
                }
            }
        }
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        Course[] courses = new Course[] {
            new GenEdCourse("GEN64-124", 4, "D+"),
            new GenEdCourse("GEN64-183", 1, "A"),
            new GenEdCourse("ITD64-172", 2, "C+"),
            new MajorCourse("COE64-211", 4, "D", 2),
            new MajorCourse("COE64-212", 4, "D", 2),
            new MajorCourse("COE64-322", 1, "W", 3)
        };

        // Display initial courses
        displayCourse(courses);

        // Change grade example
        String idToChange = "ITD64-172";
        String newGrade = "W";
        changeGrade(courses, idToChange, newGrade);

        // Display updated courses
        System.out.println("Change grade of subject : " + idToChange);
        System.out.println("Change to grade : " + newGrade);
        System.out.println("=======================");
        displayCourse(courses);
    }
}
