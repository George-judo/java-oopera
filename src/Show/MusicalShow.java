package Show;

import People.Actor;
import People.Director;
import java.util.ArrayList;

public class MusicalShow extends Show{
    public String musicAuthor;
    public String librettoText;

    public MusicalShow(String title, int duration, Director director, String musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public MusicalShow(String title, int duration, Director director, String musicAuthor,
                       String librettoText, ArrayList<Actor> listOfActors) {
        this(title, duration, director, musicAuthor, librettoText);
        this.listOfActors = listOfActors;
    }

    public void printLibbertoText(){
        System.out.println(librettoText);
    }


}
