package person;

public class Person {
    protected String name;
    protected String surname;
    public int numTic;

    public Person(String name, String surname, int numTic) {
        this.name = name;
        this.surname = surname;
        this.numTic = numTic;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
