package ru.job4j.my.singleton2;

public class Mercedes implements Car {
    @Override
    public String name() {
        return "Mercedes";
    }

    @Override
    public String description() {
        return "This is most remarkable car";
    }
}
