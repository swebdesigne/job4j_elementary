package ru.job4j.my.abstarctfactrory2;

public class WindowsPC implements Windows {
    @Override
    public int input() {
        return 1;
    }

    @Override
    public int output() {
        return 2;
    }
}
