package ru.job4j.ooa;

public final class Airbus extends Aircraft {
    private static final int COUNT_ENGINE = 2;
    private String name;

    public Airbus(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printModel() {
        System.out.println("The model of the airplane: " + name);
    }

    @Override
    public String toString() {
        return "Airbus{"
                + "name='" + name
                + '\''
                + '}';
    }

    public void printCountEngine() {
//        if (getName().equals("A380")) {
//            System.out.println("Count of the engines equal: 4");
//        } else {
//            System.out.println("Count of the engines equal: " + COUNT_ENGINE);
//        }
        for (Airplane airplane : airplanes()) {
            if (getName().equals(airplane.name())) {
                System.out.println("Count of the engines equal: " + airplane.countEngine());
            }
        }
    }

    public Airplane[] airplanes() {
        Airplane[] airplane = {
          new A320(),
          new A380()
        };
        return airplane;
    }
}
