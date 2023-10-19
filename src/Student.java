
public class Student extends Person{

    private String major;

    public Student(String name, int date_of_birth, String major){
       super(name, date_of_birth);
        this.major = major;

    }

    @Override
    public String toString() {
        return "Student{" +
                "major='" + major + '\'' +
                "} " + super.toString();
    }
}
