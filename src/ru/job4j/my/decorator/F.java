package ru.job4j.my.decorator;

public class F implements OurFemily {
    OurFemily ourFemily;

    public F(OurFemily ourFemily) {
        this.ourFemily = ourFemily;
    }

    @Override
    public String make() {
        return ourFemily.make();
    }
}
