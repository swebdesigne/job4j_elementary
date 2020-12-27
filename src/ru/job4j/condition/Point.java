package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int x2, int y1, int y2) {
        double rsl = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return rsl;
    }

    public static void main(String[] args) {
        int x1 = 0;
        int x2 = 2;
        int y1 = 0;
        int y2 = 10;
        double result = Point.distance(x1, x2, y1, y2);
        System.out.println(result);
    }
}
