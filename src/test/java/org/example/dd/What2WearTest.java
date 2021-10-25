package org.example.dd;

import org.junit.Test;

public class What2WearTest {
    @Test
    public void testAtHome() {
        System.out.print("在家：");
        Person person = new SomebodyAtHome();
        person.whereAndWear();
    }

    @Test
    public void testAtBeach() {
        System.out.print("在沙滩：");
        Person person = new SomebodyAtHome();
        person = new SomebodyOutdoorAtBeach(person);
        person.whereAndWear();
    }

    @Test
    public void testAtNightclub() {
        System.out.print("在夜店：");
        Person person = new SomebodyAtHome();
        person = new SomebodyOutdoorAtBeach(person);
        person = new SomebodyOutdoorAtNightclub(person);
        person.whereAndWear();
    }

    @Test
    public void testAtWork() {
        System.out.print("在工作：");
        Person person = new SomebodyAtHome();
        person = new SomebodyOutdoorAtBeach(person);
        person = new SomebodyOutdoorAtWork(person);
        person.whereAndWear();
    }

}
