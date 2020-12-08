package ru.job4j.condition;

public class LogicNot {
    public boolean isEven(int num){
        return num % 2 == 0;
    }

    public boolean isPositive(int num){
        return num > 0;
    }

    public boolean notEven(int num){
        return num % 2 == 1;
    }

    public  boolean notEvenAndPositive(int num){
        return (num % 2 == 1 && num > 0);
    }

    public boolean evenOrNotPositive(int num){
        return (num % 2 == 0 && num < 0);
    }

    public static void main(String[] args){
        int num = 3;
        var result = new LogicNot();
        System.out.println(result.isEven(num));
        num = 2;
        System.out.println(result.isPositive(num));
        num = 1;
        System.out.println(result.notEven(num));
        num = -2;
        System.out.println(result.notEvenAndPositive(num));
        num = 4;
        System.out.println(result.evenOrNotPositive(num));
    }
}
