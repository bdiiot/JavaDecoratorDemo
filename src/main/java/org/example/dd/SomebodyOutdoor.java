package org.example.dd;

public abstract class SomebodyOutdoor extends Person {
    public Person person;

    public SomebodyOutdoor(Person person) {
        this.person = person;
    }

    @Override
    public void whereAndWear() {
        this.person.whereAndWear();
    }
}
