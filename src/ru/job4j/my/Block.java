package ru.job4j.my;

public class Block {
    int a, b, c;
    int volume;

    Block(int i, int j, int k) {
        this.a = i;
        this.b = j;
        this.c = k;
        volume = a * b * c;
    }

    boolean sameBlock(Block ob) {
        if ((ob.a == a) && (ob.b == b) && (ob.c == c)) return true;
        else return false;
    }

    boolean sameVolume(Block obj) {
        if (obj.volume == volume) return true;
        else return false;
    }
}
