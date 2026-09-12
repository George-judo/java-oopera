package People;

public class Person {
    protected String name; // поменял паблик на протект
    protected String surname;
    protected Gender gender;

    public Person(String surname, String name, Gender gender) {
        this.surname = surname;
        this.name = name;
        this.gender = gender;
    }


    public String getSurname() { //добавил геттеры и сеттеры тк изза того что фамилия протект не могу к ней обращаться из другого пакета
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
