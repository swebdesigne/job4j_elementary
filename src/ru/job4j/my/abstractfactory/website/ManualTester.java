package ru.job4j.my.abstractfactory.website;

import ru.job4j.my.abstractfactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester test website...");
    }
}
