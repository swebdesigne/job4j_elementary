package ru.job4j.condition;

public class LogicNot {
    public boolean isEven(int num) {
        return num % 2 == 0;
    }

    public boolean isPositive(int num) {
        return num > 0;
    }

    public boolean notEven(int num) {
        return !isEven(num);
    }

    public boolean notPositive(int num) {
        return !isPositive(num);
    }

    public  boolean notEvenAndPositive(int num) {
        return notEven(num) && isPositive(num);
    }

    public boolean evenOrNotPositive(int num) {
        return isEven(num) || notPositive(num);
    }

    public static void main(String[] args) {
        var result = new LogicNot();
        System.out.println(result.isEven(3));
        System.out.println(result.isPositive(2));
        System.out.println(result.notEven(1));
        System.out.println(result.notPositive(-1));
        System.out.println(result.notEvenAndPositive(-1));
        System.out.println(result.evenOrNotPositive(4));
    }
}
