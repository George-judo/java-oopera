import People.Actor;
import People.Gender;
import People.Director;
import Show.Show;
import Show.Opera;
import Show.Ballet;

public class Theatre {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Петров", "Пётр", Gender.MALE, 180);
        Actor actor2 = new Actor("Сидорова", "Анна", Gender.FEMALE, 165);
        Actor actor3 = new Actor("Иванов", "Иван", Gender.MALE, 175);

        Director director1 = new Director("Смирнов", "Алексей", Gender.MALE, 15);
        Director director2 = new Director("Козлова", "Мария", Gender.FEMALE, 10);

        String musicAuthor = "Чайковский";
        String choreographer = "Петипа";

        Show show = new Show("Обычный спектакль", 60, director1);
        Opera opera = new Opera("Опреа", 50, director1, musicAuthor, "Либрето текст", 10);
        Ballet ballet = new Ballet("Баллет", 90, director2, musicAuthor, "Libretto text", choreographer);

        show.addNewActor(actor1);
        show.addNewActor(actor3);
        opera.addNewActor(actor2);
        ballet.addNewActor(actor1);
        ballet.addNewActor(actor2);
        ballet.addNewActor(actor3);

        System.out.println("Сотав актеров для обчного спектакля");
        show.printListOfActors();
        System.out.println("Состав актеров для Оперы");
        opera.printListOfActors();
        System.out.println("Состав актеров для Баллета");
        ballet.printListOfActors();

        opera.exchangeActors(actor3, "Сидорова");
        opera.printListOfActors();

        opera.exchangeActors(actor1, "Чайковский");

        opera.printLibbertoText();
        ballet.printLibbertoText();

    }
}
