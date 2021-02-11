package ru.job4j.ooa;

public class Main {
    public static void main(String[] args) {
        final User FIRST_USER = new User("Petr", 32);
        System.out.println("Output in console before change");
        System.out.println(FIRST_USER);

        FIRST_USER.setName("Petr Arsentev");
        FIRST_USER.setAge(33);
        System.out.println("Output in console after changed");
        System.out.println(FIRST_USER);
    }
}
