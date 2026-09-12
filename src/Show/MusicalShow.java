package Show;

import People.Actor;
import People.Director;
import People.Person;

import java.util.ArrayList;

public class MusicalShow extends Show{
    protected Person musicAuthor;
    protected String librettoText;

    public MusicalShow(String title, int duration, Director director, Person musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public MusicalShow(String title, int duration, Director director, Person musicAuthor,
                       String librettoText, ArrayList<Actor> listOfActors) {
        this(title, duration, director, musicAuthor, librettoText);
        this.listOfActors = listOfActors;
    }

    public void printLibbertoText(){
        System.out.println(librettoText);
    }


}
