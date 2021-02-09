package ru.job4j.ex;

public class Config {
    public static void load(String path) {
        if (path == null) {
            throw  new IllegalStateException("Path could`t` by null");
        }
        System.out.println("Load config by " + path);
    }

    public static void main(String[] args) {
        load("jdbc://localhost:8080");
    }
}
