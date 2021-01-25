package ru.job4j.io;
import java.util.Scanner;
import java.util.Random;

public class MagicBall {
    public static void main(String[] args) {
        Scanner question = new Scanner(System.in);
        System.out.printf("ask me\n");
        String name = question.nextLine();
        int  answer = new Random().nextInt(3);
        String value = switch (answer) {
            case 0 -> "Yes";
            case 1 -> "No";
            default -> "Maybe";
        };
        System.out.printf(name + " = " + value);
    }
}
