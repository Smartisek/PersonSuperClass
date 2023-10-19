

public class Instructor extends Person{

    private float salary;


    public Instructor(String name, int date_of_birth, float salary){
        super(name, date_of_birth);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "salary=" + salary +
                "} " + super.toString();
    }
}
