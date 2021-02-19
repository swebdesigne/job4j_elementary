package ru.job4j.my.singleton2;

public class Auto {
    Car car;

    public Car data(String name) {
        switch (name) {
            case "Mercedes" : car = new Mercedes();
            break;
            case "Toyota" : car = new Toyota();
            break;
            default: car = new Car() {
                @Override
                public String name() {
                    return "Any car";
                }

                @Override
                public String description() {
                    return "Better have one car than no cars";
                }
            };
            break;
        }
        return car;
    }
}
