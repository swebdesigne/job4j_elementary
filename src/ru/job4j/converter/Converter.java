package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return  rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return  rsl;
    }

    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
    }
}
