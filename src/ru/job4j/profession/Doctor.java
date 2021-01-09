package ru.job4j.profession;
public class Doctor extends Profession {
    private String historyDisease;
    private String patientName;
    private int numberRoom;

    public Doctor(String historyDisease, String patientName, int numberRoom, String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
        this.historyDisease = historyDisease;
        this.patientName = patientName;
        this.numberRoom = numberRoom;
    }

    public void getPatientName() {
    }

    public void getPatientSurName() {
    }

    public void getAge() {
    }

    public void getNumberRoom() {
    }
}
