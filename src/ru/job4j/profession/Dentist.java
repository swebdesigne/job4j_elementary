package ru.job4j.profession;

public class Dentist extends Doctor {
    public Dentist(String historyDisease, String patientName, int numberRoom, String name, String surname, String education, String birthday) {
        super(historyDisease, patientName, numberRoom, name, surname, education, birthday);
    }

    public void treatmentTeeth(Pacient pacient) {
    }
}
