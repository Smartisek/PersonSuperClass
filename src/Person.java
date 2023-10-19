import java.util.Objects;

public class Person implements Comparable<Person>{

    private String name;
    private int date_of_birth;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return date_of_birth == person.date_of_birth && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, date_of_birth);
    }

    public Person(String name, int date_of_birth) {
        this.name = name;
        this.date_of_birth = date_of_birth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(int date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", date_of_birth=" + date_of_birth +
                '}';
    }

    @Override
    public int compareTo(Person other){
        int nameComparison = String.CASE_INSENSITIVE_ORDER.compare(this.name, other.name);
        if(nameComparison != 0){
            return nameComparison;
        }
        return -Integer.compare(this.date_of_birth, other.date_of_birth);
    }
}


