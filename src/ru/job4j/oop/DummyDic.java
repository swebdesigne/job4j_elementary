package ru.job4j.oop;

public class DummyDic {
    public static void main(String[] args) {
        DummyDic word = new DummyDic();
        System.out.println(word.entToRus("world"));
    }

    public String entToRus(String eng) {
        return "Неизвестное слово " + eng;
    }
}
