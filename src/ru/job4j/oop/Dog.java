package ru.job4j.oop;

public class Dog implements Animal{
    @Override
    public void sound() {
        System.out.println(getClass().getSimpleName() + " don`t like cats, he is run always for it");
    }
}
