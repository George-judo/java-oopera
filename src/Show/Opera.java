package Show;

import People.Actor;
import People.Director;
import People.Person;

import java.util.ArrayList;

public class Opera extends MusicalShow{
    private int choirSize;

    public Opera(String title, int duration, Director director, Person musicAuthor,
                 String librettoText, int choirSize) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    public Opera(String title, int duration, Director director, Person musicAuthor,
                 String librettoText, int choirSize, ArrayList<Actor> listOfActors) {
        this(title, duration, director, musicAuthor, librettoText, choirSize);
        this.listOfActors = listOfActors;
    }
}
