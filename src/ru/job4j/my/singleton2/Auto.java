package ru.job4j.my.singleton2;

public class Auto {
    Car car;

    public Car data(String name) {
        return car = switch (name) {
            case "Mercedes" -> new Mercedes();
            case "Toyota" -> new Toyota();
            default -> new Car() {
                @Override
                public String name() {
                    return "Any car";
                }

                @Override
                public String description() {
                    return "Better have one car than no cars";
                }
            };
        };
    }
}
