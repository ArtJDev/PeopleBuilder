public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Некорректный возраст");
        } else {
            this.age = age;
            return this;
        }
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public boolean hasName(String name, String surname) {
        return (name != null && surname != null);
    }

    public Person build() {
        if (!hasName(name, surname)) {
            throw new IllegalStateException("Не хватает имени или фамилии");
        }
        return new Person(name, surname, age);
    }
}