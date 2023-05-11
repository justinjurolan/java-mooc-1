
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
    public boolean equals (Object compared) {
        // if the variable are located in the same place.
        if (this == compared) {
            return true;
        }
        
        // if the compared object is not an instanceof Person class
        if (!(compared instanceof Person)) {
            return false;
        }
        // lets cast tha object to Person
        Person comparedPerson = (Person) compared;
        
        // check if all the variable are the same
        if (this.name.equals(comparedPerson.name) && 
                this.height == comparedPerson.height &&
                this.weight == comparedPerson.weight &&
                this.birthday.equals(comparedPerson.birthday)) {
            return true;
        }
        return false;
    }
}
