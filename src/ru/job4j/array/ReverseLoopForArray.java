package ru.job4j.array;

public class ReverseLoopForArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 1) {
                System.out.println("Текущий элемент массива начиная с последнего: " + numbers[numbers.length - i - 1]);
            }
        }
    }
}
