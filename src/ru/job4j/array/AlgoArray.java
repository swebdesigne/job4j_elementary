package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        int tmp = array[0];
        array[0] = array[3];
        array[3] = tmp;
        tmp = array[1];
        array[1] = array[2];
        array[2] = tmp;
        tmp = array[3];
        array[3] = array[4];
        array[4] = tmp;
        for (int i : array) {
            System.out.println(i);
        }
    }
}
