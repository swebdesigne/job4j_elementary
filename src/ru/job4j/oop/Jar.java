package ru.job4j.oop;

public class Jar {
    private int value;

    public Jar(int size) {
        this.value = size;
    }

    public void pour(Jar another) {
        this.value = this.value + another.value;
        another.value = 0;
    }

    public static void main(String[] args) {
        Jar first = new Jar(10);
        Jar second = new Jar(5);
        Jar third = new Jar(1);
        System.out.println("first : " + first.value + ". second : " + second.value);
        first.pour(third);
        System.out.println("first : " + first.value + ". second : " + second.value);
    }
}
