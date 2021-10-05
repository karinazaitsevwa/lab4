public class Piglet extends Person {
    private final int numberOfRoom;

    public Piglet(String gender, String name, int age, int height, int numberOfRoom) {
        this.gender = gender;
        this.name = name;
        this.age = age;
        this.height = height;
        this.numberOfRoom = numberOfRoom;
    }

    @Override
    public String toString() {
        return "Piglet{" +
                "gender = '" + gender + '\'' +
                ", name = '" + name + '\'' +
                ", age = " + age +
                ", height = " + height +
                ", numberOfRoom = " + numberOfRoom +
                '}';
    }

}
