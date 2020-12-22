package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int remainder = money - price;
        for (int i = 0; i <= coins.length - 1; i++) {
            while (remainder > 0) {
                rsl[i] = coins[i];
                remainder -= coins[i];
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }

    public static void main(String[] args) {
        int money = 50;
        int price = 35;
        int[] rsl = change(money, price);
        for (int i = 0; i < rsl.length - 1; i++) {
            System.out.println(rsl[i]);
        }
    }
}