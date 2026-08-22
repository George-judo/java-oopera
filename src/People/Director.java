package People;
import Show.Show;
import java.util.ArrayList;

public class Director extends Person {
    public int numberOfShows;

    public Director(String surname, String name, Gender gender, int numberOfShows) {
        super(surname, name, gender);
        this.numberOfShows = numberOfShows;
    }

    @Override
    public String toString() {
        return "Director{" +
                "gender=" + gender +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", numberOfShows=" + numberOfShows +
                '}';
    }
}
