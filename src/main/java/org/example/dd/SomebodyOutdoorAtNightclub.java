package org.example.dd;

public class SomebodyOutdoorAtNightclub extends SomebodyOutdoor {
    public SomebodyOutdoorAtNightclub(Person person) {
        super(person);
    }

    private void close4Nightclub() {
        System.out.print("，穿上透视装");
    }

    @Override
    public void whereAndWear() {
        super.whereAndWear();
        this.close4Nightclub();
    }
}
