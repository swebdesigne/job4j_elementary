package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] age = new short[10];
        System.out.println("Размер массива равен: " + age.length);
        String[] surname = new String[100500];
        System.out.println("Размер массива равен:"  + surname.length);
        float[] prices = new float[40];
        System.out.println("Размер массива равен: " + prices.length);

        String[] name = new String[4];
        name[0] = "Igor";
        name[1] = "Boris";
        name[2] = "Alina";
        name[3] = "Fedor";
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
    }
}
