package ru.job4j.my;

public class StringMy {
    public static void main(String[] args) {
        String str = new String("Hello");
        String str2 = new String("Hello 2");
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        System.out.println(str.indexOf("o"));
        System.out.println(str.compareTo(str2));
    }

}
