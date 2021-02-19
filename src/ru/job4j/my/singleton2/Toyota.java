package ru.job4j.my.singleton2;

public class Toyota implements Car {
    @Override
    public String name() {
        return "Toyota";
    }

    @Override
    public String description() {
        return "Toyota is worse car than Mercedes";
    }
}
