package org.example.dd;

public class SomebodyOutdoorAtBeach extends SomebodyOutdoor {
    public SomebodyOutdoorAtBeach(Person person) {
        super(person);
    }

    private void close4Beach() {
        System.out.print("，穿上短裤");
    }

    @Override
    public void whereAndWear() {
        super.whereAndWear();
        this.close4Beach();
    }
}
