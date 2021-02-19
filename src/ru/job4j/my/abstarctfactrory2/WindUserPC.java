package ru.job4j.my.abstarctfactrory2;

public class WindUserPC implements SystemsOS {

    @Override
    public Windows windows() {
        return new WindowsPC();
    }

    @Override
    public MacOs macOs() {
        return new MacPC();
    }
}
