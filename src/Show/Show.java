package Show;

import People.Actor;
import People.Director;

import java.util.ArrayList;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors = new ArrayList<>();

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
    }

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        //В случае передачи в параметры уже готового списка актеров
        this(title, duration, director);
        this.listOfActors = listOfActors;
    }


    public void printListOfActors() {
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public void addNewActor(Actor newActor) {
        boolean isExist = false;
        for (Actor actor : listOfActors) {
            if (newActor.equals(actor)){
                isExist = true;
            }
        }
        if (!isExist) {
            listOfActors.add(newActor);
            System.out.println("Актер " + newActor.getSurname() + " добавлен(a)");
        } else {
            System.out.println("такой актер уже есть .");
            return;
        }
        System.out.println();
    }

    public void exchangeActors (Actor newActor, String surname){
        int indexOfRemovedActor = -1;
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(0).getSurname().equals(surname)){
                indexOfRemovedActor = i;
                System.out.println("Актер " + surname + " заменен на " + newActor.getSurname());
            }
        }
        if (indexOfRemovedActor >= 0){
            listOfActors.remove(indexOfRemovedActor);
            listOfActors.add(newActor);
        } else {
            System.out.println("Актера с такой фамилией нет в списке .");
        }
    }
}
