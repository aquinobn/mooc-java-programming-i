
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    // implement an equals method here for checking the equality of objects
    @Override
    public boolean equals(Object compared) {
        // Dos punteros apuntando al MISMO objeto.
        if (this == compared) {
            return true;
        }
        // Si el objeto referenciado no tien subtipo Person, ya no son iguales
        if (!(compared instanceof Person)) {
            return false;
        }

        Person comparedPerson = (Person) compared;

        if (!name.equals(comparedPerson.name)) {
            return false;
        }
        if (!birthday.equals(comparedPerson.birthday)) {
            return false;
        }
        if (height != comparedPerson.height) {
            return false;
        }
        if (weight != comparedPerson.weight) {
            return false;
        }
        return true;
    }
}
