package ru.job4j.array;

public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            min = min > array[i] ? array[i] : min;
        }
        return min;
    }
}
