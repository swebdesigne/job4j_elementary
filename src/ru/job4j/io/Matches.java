package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Game 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "The first player" : "The second player";
            System.out.println(player + " enter a number from 1 to 3");
            int matches = Integer.parseInt(input.nextLine());
            turn = !turn;
            while ((count - matches) < 0 || matches > 3) {
                System.out.println("Please, take the less count matches");
                input.nextLine();
                System.out.println("Please, take the less count matches");
                matches = Integer.parseInt(input.nextLine());
            }
            count -= matches;
            System.out.println("Remaining the count of the matches: " + count);
        }
        if (!turn) {
            System.out.println("Wined a first player");
        } else {
            System.out.println("Wined a second player");
        }
    }
}
