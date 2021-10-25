package org.example.dd;

public class SomebodyOutdoorAtWork extends SomebodyOutdoor {
    public SomebodyOutdoorAtWork(Person person) {
        super(person);
    }

    private void close4Work() {
        System.out.print("，穿上西装");
    }

    @Override
    public void whereAndWear() {
        super.whereAndWear();
        this.close4Work();
    }
}
