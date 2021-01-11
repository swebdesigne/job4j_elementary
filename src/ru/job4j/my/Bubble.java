package ru.job4j.my;

public class Bubble {
    public static void main(String[] args) {
        int[] nums = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
        int a, b, c, size;
        size = nums.length;
        System.out.println("The original array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + nums[i]);
        }
        System.lineSeparator();
        for (a = 1; a < size; a++) {
            for (b = size - 1; b >= a; b--) {
                if (nums[b - 1] > nums[b]) {
                    c = nums[b - 1];
                    nums[b - 1] = nums[b];
                    nums[b] = c;
                }
            }
            // displaing the sorted array
            System.out.println("\nSorted array");
            for (int i = 0; i < size; i++) {
                System.out.print(" " + nums[i]);
            }
            System.lineSeparator();
        }

    }
}
