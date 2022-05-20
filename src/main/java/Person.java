import java.util.Objects;

public class Person {
    protected final String name;
    protected final String surname;
    private int age;
    private String address;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public boolean hasAge() {
        return age >= 0;
    }

    public boolean hasAddress() {
        return address != null;
    }

    public boolean hasName() {
        return (name != null && surname != null);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public void setAddress(String city) {
        city = address;
    }

    public void happyBirthday() {
        if (hasAge()) {
            age++;
        }
    }

    public PersonBuilder newChildBuilder() {
        Person person = new Person(name, surname);
        return new PersonBuilder().setSurname(person.getSurname());
    }

    @Override
    public String toString() {
        return name + " " + surname + ", возраст " + age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }
}