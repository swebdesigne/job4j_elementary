package ru.job4j.profession;

public class Engineer extends Profession {
    private int id;
    private String company;

    public Engineer(int id, String company, String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
        this.id = id;
        this.company = company;
    }
}