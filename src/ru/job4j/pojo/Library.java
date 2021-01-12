package ru.job4j.pojo;

import java.sql.SQLOutput;

public class Library {
    public void print(Book[] books) {
        for (int index = 0; index < books.length; index++) {
            Book b = books[index];
            System.out.println(
                 "\tBook name: " + b.getName()
                 + System.lineSeparator()
                 + "\tCount page: " + b.getCountPage()
            );
        }
    }

    public void printDetermineValue(Book[] books) {
        for (int index = 0; index < books.length; index++) {
            Book b = books[index];
            if ("Clean code".equals(b.getName())) {
                System.out.println(
                    "\tBook name: " + b.getName()
                    + System.lineSeparator()
                    + "\tCount page: " + b.getCountPage()
                );
            }
        }
    }

    public static void main(String[] args) {
        Library print = new Library();
        Book first = new Book("Clean code", 620);
        Book second = new Book("Java development", 103);
        Book third = new Book("SQL for beginner", 723);
        Book fourth = new Book("Algorithms", 320);
        Book[] books = new Book[4];
        books[0] = first;
        books[1] = second;
        books[2] = third;
        books[3] = fourth;
        System.out.println("Original array");
        print.print(books);
        System.out.println();
        books[0] = fourth;
        books[3] = first;
        System.out.println("Replace value where index equal 0 and 3");
        print.print(books);
        System.out.println();
        System.out.println("Print book`s value where name equal `Clean code`");
        print.printDetermineValue(books);
    }
}
