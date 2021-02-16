package ru.job4j.my.decorator;

public class JavaDeveloper implements Developer {
    @Override
    public String makeJob() {
        return "Write java code.";
    }
}
