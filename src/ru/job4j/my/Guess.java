package ru.job4j.my;

public class Guess {
    public static void main(StringMy[] args) throws java.io.IOException{
        char ch, answer = 'k';
        System.out.println("Задумана букава из диапазона A-Z");
        System.out.println("Попытайтесь ее угадать");
        ch = (char) System.in.read();
        if(ch == answer) System.out.println("*** Правилльно! ***");
        else System.out.print("... Извините, нужная букава находится ");

        if(ch < answer) System.out.println("ближе к концу алфавита");
        else System.out.println("ближе к началу алфавита");
    }
}
