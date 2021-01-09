package ru.job4j.profession;

public class Surgeon extends Doctor {

    public Surgeon(String historyDisease, String patientName, int numberRoom, String name, String surname, String education, String birthday) {
        super(historyDisease, patientName, numberRoom, name, surname, education, birthday);
    }

    public void treatment(Pacient pacient) {
    }
}