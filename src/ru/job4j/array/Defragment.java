package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index <= array.length / 2; index++) {
            if (array[index] == null) {
                int point = index;
                for (int j = 0; j <= array.length / 2; j++) {
                    if (index != array.length - 1 && array[array.length - 1 - j] != null) {
                        String value = array[array.length - 1 - j];
                        array[array.length - 1 - j] = array[point];
                        array[point] = value;
                        break;
                    }
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.println(compressed[index] + ' ');
        }
    }
}
