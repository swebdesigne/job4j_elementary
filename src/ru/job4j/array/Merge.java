package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int iterator = 0;
        for (int i = 0; i < rsl.length; i++) {
            int leftIterator = i < left.length ? left[i] : 0;
            int rightIterator = i < right.length ? right[i] : 0;
            if (leftIterator < rightIterator) {
                rsl[iterator] = leftIterator;
                if (left[i] < rightIterator) {
                    rsl[iterator + 1] = rightIterator;
                }
            }
            iterator += 2;

//            System.out.println(rsl[i]);
        }

        return rsl;
    }

    public static void main(String[] args) {
        int[] left = new int[] {1, 2};
        int[] right = new int[] {3, 4};
        int[] rsl = merge(left, right);
        for (int r: rsl) {
            System.out.println(r);
        }
    }
}
