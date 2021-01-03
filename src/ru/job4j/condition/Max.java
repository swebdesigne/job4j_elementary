package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        return   first >= second ? first : second;
    }

    public static int max(int first, int second, int third) {
        return max(first, max(second, third));
    }

    public static int max(int first, int second, int third, int fourth) {
        return max(first, max(second, third), fourth);
    }

    public static void main(String[] args) {
        int rsl = Max.max(7, 9, 4, 5);
        System.out.println(rsl);
    }
}


