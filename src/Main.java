public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Dominik", 1999);
        System.out.println(person1);

        Student student1 = new Student("Jack", 2001, "Engineering");
        System.out.println(student1);

        Instructor instructor1 = new Instructor("Dermont", 1985, 60000.00f);
        System.out.println(instructor1);
    }


}