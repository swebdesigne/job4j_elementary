package ru.job4j.my.factory;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpecialty("php");
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();
    }

    static DeveloperFactory createDeveloperBySpecialty(String specialty) {
        if (specialty.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("c++")) {
            return new CppDeveloperFactory();
        } else {
            throw new RuntimeException(specialty + " is unknown specialty");
        }
    }
}
