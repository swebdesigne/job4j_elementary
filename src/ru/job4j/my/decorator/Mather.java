package ru.job4j.my.decorator;

public class Mather extends F {
    public Mather(OurFemily ourFemily) {
        super(ourFemily);
    }

    @Override
    public String make() {
        return super.make() + " Give the enable.";
    }
}
