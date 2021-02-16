package ru.job4j.my.decorator;

class Father extends F {
    public Father(OurFemily ourFemily) {
        super(ourFemily);
    }

    @Override
    public String make() {
        return super.make() + " I give task.";
    }
}
