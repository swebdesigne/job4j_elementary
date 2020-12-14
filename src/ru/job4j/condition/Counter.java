package ru.job4j.condition;

public class Counter {
    public static int sum(int start, int end) {
        int sum = 0;
        for (int index = start; index <= end; index++) {
            sum += index;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
    }
}
