package ru.job4j.oop;

import java.awt.*;

public class College {
    public static void main(String[] args) {
        Freshman freshman = new Freshman();
        Object object = freshman;
        Student student = (Student) freshman;
    }
}
