package ru.job4j.oop;

public class Bug {
    private String name;

    public Bug(String text) {
        name = text;
    }

    public static void main(String[] args) {
        Bug item = new Bug("Igor");
    }
}
