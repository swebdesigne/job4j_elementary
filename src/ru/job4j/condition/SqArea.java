package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        double s = l * h;
        return s;
    }

    public static void main(String[] args) {
        int p = 4;
        int k = 1;
        double result = SqArea.square(p, k);
        System.out.println(result);
    }
}
