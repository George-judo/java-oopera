package Show;

import People.Actor;
import People.Director;

import java.util.ArrayList;

public class Ballet extends MusicalShow{
    public String choreographer;

    public Ballet(String title, int duration, Director director, String musicAuthor,
                  String librettoText, String choreographer) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    public Ballet(String title, int duration, Director director, String musicAuthor,
                  String librettoText, String choreographer, ArrayList<Actor> listOfActors) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choreographer = choreographer;
        this.listOfActors = listOfActors;
    }
}
