package ru.job4j.my;

public class Spaces {
    public static void main(String[] args) throws java.io.IOException {
        {
            char ch;
            int spaces = 0;
            System.out.println("for stop, input simbol of the poin");
            do {
                ch = (char) System.in.read();
                if (ch == ' ') spaces++;
            } while (ch != '.');
        }
    }
}
