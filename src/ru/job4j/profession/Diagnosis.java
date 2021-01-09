package ru.job4j.profession;

public class Diagnosis extends Doctor {
    private String diagnosis;

    public Diagnosis(String historyDisease, String patientName, int numberRoom, String name, String surname, String education, String birthday) {
        super(historyDisease, patientName, numberRoom, name, surname, education, birthday);
    }

    public void getDiagnosis() {
    }
}
