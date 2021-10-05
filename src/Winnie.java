import java.util.Objects;

public class Winnie extends Person {

    private final String status = "Captain";

    public Winnie(String gender, String name, int age, int height) {
        this.gender = gender;
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void toDangleLegs(Ship ship) {
        System.out.println("Winnie dangles his legs carefree at the deck.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Winnie winnie = (Winnie) o;
        return Objects.equals(status, winnie.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), status);
    }


}
