package Practice_9.Task_4;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person otherPerson) {
        return Integer.compare(this.age, otherPerson.age);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Alice", 20);
        Person person2 = new Person("Bob", 25);

        int result = person2.compareTo(person1);

        System.out.println(result);
        if (result < 0) {
            System.out.println(person1.getName() + " старше");
        } else if (result > 0) {
            System.out.println(person2.getName() + " старше");
        } else {
            System.out.println(person1.getName() + " и " + person2.getName() + " равны");
        }
    }
}
