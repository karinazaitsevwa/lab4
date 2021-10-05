import java.util.Objects;

public abstract class Person {
    protected String gender;
    protected String name;
    protected int age;
    protected int height;
    protected int weight;

    public Person() {}

    public Person(String gender, String name, int age, int height, int weight) {
        this.gender = gender;
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;

    }

    public void choiceVoyage(Location location) {
        System.out.println(this.name + " is chooses a voyage.");
        location.printTimetable();
        System.out.println(this.name + " chose voyage");
    }

    // overloading
    public boolean equals (Person person){
        if (this.gender.equals(person.gender) && this.name.equals(person.name)
                && (new Integer(age).equals(new Integer(person.age)))
                && this.height == person.height) {
            return true;
        } else return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(gender, name, age, height) * 42;
    }

    @Override
    public String toString() {
        return "Person{" +
                "gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}
