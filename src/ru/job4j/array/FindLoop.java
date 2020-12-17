package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    public static int indexOf(int[] data, int el, int start, int finish) {
        int result = -1;
        for (int i = 0; i < data.length; i++) {
            if (i >= start && i <= finish && data[i] == el) {
                result = i;
                break;
            }
        }
        return result;
    }
}
