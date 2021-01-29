package ru.job4j.oop;

public class Pet implements Animal {
    @Override
    public void sound() {
        System.out.println(getClass().getSimpleName() + " needs vaccinations, so as not to get sick ");
    }
}
