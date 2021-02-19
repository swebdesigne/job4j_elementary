package ru.job4j.my.abstarctfactrory2;

public class User {
    public static void main(String[] args) {
        SystemsOS windows = new WindUserPC();
        System.out.println(windows.windows().input());
        SystemsOS mac = new MacUserPC();
        System.out.println(mac.macOs().output());
    }
}
