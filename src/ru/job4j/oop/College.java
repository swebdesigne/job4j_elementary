package ru.job4j.oop;

public class College{
    public static void main(String[] args) {
        Freshman freshman = new Freshman();
        Object object = freshman;
        Student college = (Student) object;
    }
}
