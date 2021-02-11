package ru.job4j.ooa;

public class A320 implements Airplane {
    private static final int COUNT_ENGINE = 2;
    private String name = "A320";

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public int countEngine() {
        return COUNT_ENGINE;
    }
}
