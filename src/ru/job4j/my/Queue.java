package ru.job4j.my;

public class Queue {
    char q[];
    int putloc, getloc;

    public Queue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    // placing simbol to a queue
    void put(char ch) {
        if (putloc == q.length) {
            System.out.printf("- The queue is filled");
            return;
        }
        q[putloc++] = ch;
    }

    public char get() {
        if (getloc == putloc) {
            System.out.printf("- The queue is empty");
            return (char) 0;
        }
        return q[getloc++];
    }

    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;
        System.out.printf("Used the big Q queue to save the alphabet");
        for (i = 0; i < 26; i++)
            bigQ.put((char) ('A' + i));
        System.out.printf("Getting and showing the letters of the simbols from queue bigQ");
        for (i = 0; i < 26; i++) {
            ch = bigQ.get();
            if (ch != (char) 0) System.out.printf("ch");
        }
        System.out.printf("\n");
        System.out.printf("Using queue smallQ for generation the errors");
        for (i = 0; i < 5; i++) {
            System.out.printf("Tried to save it " + (char) ('Z' - 1));
            smallQ.put((char) ('Z' - i));
            System.out.printf("");
        }
        System.out.printf("");
        System.out.printf("Content of the queue smallQ: ");
        for (i = 0; i < 5; i++) {
            ch = smallQ.get();
            if (ch != (char) 0) System.out.println(ch);
        }
    }
}
