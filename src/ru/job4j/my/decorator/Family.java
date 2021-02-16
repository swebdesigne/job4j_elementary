package ru.job4j.my.decorator;

public class Family {
    public static void main(String[] args) {
        OurFemily ourFemily = new Mather(new Father(new Son()));
        System.out.println(ourFemily.make());
    }
}
