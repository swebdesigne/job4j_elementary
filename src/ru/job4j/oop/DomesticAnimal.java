package ru.job4j.oop;

public class DomesticAnimal implements Animal {
    @Override
    public void sound() {
        System.out.println(getClass().getSimpleName() + " live in farm, bringing useful");
    }
}
