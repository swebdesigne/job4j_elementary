package ru.job4j.condition;

public class MathAbsUsage {
    public static void main(String[] args) {
        int i = 10;
        int j = 3;
        int rsl = j - i;
        System.out.println("th result equals to value = " + rsl);
        int abs = Math.abs(rsl);
        System.out.println("by means of instruction we remove the values` sign.\nAnd now our the value have`t the sign and equals " + abs);
    }
}
