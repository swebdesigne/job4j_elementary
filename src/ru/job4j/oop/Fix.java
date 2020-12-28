package ru.job4j.oop;

public class Fix {
    private String desc;

    public Fix(String txt) {
        desc = txt;
    }

    public static void main(String[] args) {
        String txt = "Test";
        Fix elem = new Fix(txt);
    }
}
