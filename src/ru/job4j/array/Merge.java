package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int iterator = 0;
        int leftCount = 0;
        int rightCount = 0;
        for (int i = 0; i < rsl.length; i++) {
            if (leftCount < left.length && rightCount < right.length) {
                if (left[leftCount] < right[rightCount]) {
                    rsl[iterator] = left[leftCount];
                    leftCount++;
                } else {
                    rsl[iterator] = right[rightCount];
                    rightCount++;
                }
                iterator++;
            } else if (leftCount != left.length) {
               rsl[iterator] = left[leftCount];
               iterator++;
               leftCount++;
           } else if (rightCount != right.length) {
               rsl[iterator] = right[rightCount];
               iterator++;
               rightCount++;
           }
        }
        return rsl;
    }
}
