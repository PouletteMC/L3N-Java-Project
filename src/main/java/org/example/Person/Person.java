package org.example.Person;

/**
 * @author Eliot, Adam, Laura, Sebastian
 * @version 1.5
 * Abstract class that defines parameters, methods and signatures for all Person objects
 */

public abstract class Person {
    private final String name;
    private final String surname;
    private final int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public abstract String toString();
}
