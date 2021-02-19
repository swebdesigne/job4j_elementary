package ru.job4j.my.singleton2;

public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto();
        System.out.println(auto.data("Mercedes").name());
        System.out.println(auto.data("Camry").description());
    }
}
