package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int l = 0;
        int r = 0;
        for (int index = 0; index < rsl.length; index++) {
            if (l > left.length - 1) {
                rsl[index] = right[r];
                r++;
            } else if (r > right.length - 1) {
                rsl[index] = left[l];
                l++;
            } else if (left[l] < right[r]) {
                rsl[index] = left[l];
                l++;
            } else {
                rsl[index] = right[r];
                r++;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        int[] left = new int[] {1, 2};
        int[] right = new int[] {3, 4};
        int[] rsl = merge(left, right);
        for (int r : rsl) {
            System.out.println(r);
        }
    }
}
