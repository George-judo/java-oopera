package People;

import java.util.Objects;

public class Actor extends Person{
    public int height;

    public Actor(String surname, String name, Gender gender, int height) {
        super(surname, name, gender);
        this.height = height;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "height=" + height +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender=" + gender +
                '}';
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Actor other = (Actor) obj;
        return Objects.equals(this.surname, other.surname) && Objects.equals(this.name, other.name) &&
                this.gender == other.gender && this.height == other.height ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, name, gender, height);
    }
}
