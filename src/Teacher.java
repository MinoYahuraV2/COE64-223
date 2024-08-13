public class Teacher {
    private String name;
    private char gender;
    private int age;
    private char status;

    // Constructor
    public Teacher(String name, char gender, int age, char status) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.status = status;
    }

    // Getter and Setter methods
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public String getStatus() {
        return status == 'M' ? "Marriage" : "Single";
    }

    public void setStatus(char status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", status=" + getStatus() +
                '}';
    }

    public static void main(String[] args) {
        // Creating Teacher objects
        Teacher teacher1 = new Teacher("AAA", 'F', 40, 'M');
        Teacher teacher2 = new Teacher("BBB", 'M', 51, 'S');
        Teacher teacher3 = new Teacher("CCC", 'M', 39, 'M');
        Teacher teacher4 = new Teacher("DDD", 'F', 45, 'S');
        Teacher teacher5 = new Teacher("FFF", 'F', 31, 'S');

        // Counting number of Marriage, Single, Female, and Male
        int marriageCount = 0;
        int singleCount = 0;
        int femaleCount = 0;
        int maleCount = 0;

        Teacher[] teachers = {teacher1, teacher2, teacher3, teacher4, teacher5};
        for (Teacher teacher : teachers) {
            if (teacher.getStatus().equals("Marriage")) {
                marriageCount++;
            } else if (teacher.getStatus().equals("Single")) {
                singleCount++;
            }

            if (teacher.getGender() == 'F') {
                femaleCount++;
            } else if (teacher.getGender() == 'M') {
                maleCount++;
            }
        }

        // Printing Teacher objects
        System.out.println(teacher1);
        System.out.println(teacher2);
        System.out.println(teacher3);
        System.out.println(teacher4);
        System.out.println(teacher5);

        // Printing counts
        System.out.println("No. of Marriages: " + marriageCount+", No. of Singles: " + singleCount);

        System.out.println("No. of Females: " + femaleCount+", No. of Males: " + maleCount);

    }
}