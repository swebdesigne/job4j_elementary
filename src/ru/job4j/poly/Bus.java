package ru.job4j.poly;

public class Bus implements Transport{
    @Override
    public void drive() {
        System.out.printf("Going to Moscow");
    }

    @Override
    public void passengers() {
        System.out.printf("we have 8 the passengers");
    }

    @Override
    public float refill(float fuel) {
        return fuel * 42;
    }

    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.drive();
        System.out.println();
        bus.passengers();
        System.out.println();
        float refill = bus.refill(20f);
        System.out.println("cost the fuel: " + refill);
    }
}
