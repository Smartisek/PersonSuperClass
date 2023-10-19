import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> students = new ArrayList<>();
        Person person1 = new Person("Dominik", 1999);
        System.out.println(person1);

        Student student1 = new Student("Dominik", 2005, "Engineering");
        System.out.println(student1);
        Student student2 = new Student("Dominik", 2002,"Data Analyst");

        Student student3 = new Student("Luke",2002, "Engineering");

        Instructor instructor1 = new Instructor("Dermont", 1985, 60000.00f);
        System.out.println(instructor1);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        Collections.sort(students);
        System.out.println(students);

        System.out.println("They are same: " + student1.equals(student2));
        System.out.println("Same hash student1? : " + student1.hashCode());
        System.out.println("Same hash student2? :" + student2.hashCode());

        Comparator<Person> studentGetName = new Comparator<Person>() {
            public int compare(Person student1, Person student2){
                return student1.getName().compareTo(student2.getName());
            }
        };

        Collections.sort(students);
        Person keyName = new Person("Luke", 0);
        int index = Collections.binarySearch(students, keyName, studentGetName);
        if(index >=0){
            System.out.println("Found " + students.get(index) + " at index " + index);
        } else{
            System.out.println("Not found");
        }
    }


}