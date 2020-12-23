package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index <= array.length - 1; index++) {
            if (array[index] == null) {
                int point = index;
                for (int j = index + 1; j < array.length; j++) {
                    if (array[j] != null) {
                        String value = array[j];
                        array[j] = array[point];
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
