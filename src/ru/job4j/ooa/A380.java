package ru.job4j.ooa;

public class A380 implements Airplane {
    private static final int COUNT_ENGINE = 4;
    private String name = "A380";

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public int countEngine() {
        return COUNT_ENGINE;
    }
}
