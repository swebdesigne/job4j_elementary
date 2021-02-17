package ru.job4j.my.abstractfactory.website;

import ru.job4j.my.abstractfactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code...");
    }
}
