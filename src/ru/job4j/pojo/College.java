package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Igor");
        student.setSurname("Sivolobov");
        student.setPatronymic("Petrovich");
        student.setGroup((byte) 1);
        student.setReceiptDate(new Date());
        System.out.println(
                "Student: " + student.getSurname() + student.getName() + " " + student.getPatronymic()
                + System.lineSeparator()
                + "Group № " + student.getGroup()
                + System.lineSeparator()
                + "Receipt date: " + student.getReceiptDate()
        );
    }
}
