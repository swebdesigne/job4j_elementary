package ru.job4j.calculate;

public class X2 {
    public static int calc(int a, int b, int c, int x){
        return a * x * x + b * x + c;
    }
    public static void main(String[] args){
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;
        System.out.println(X2.calc(a, b, c, x));
    }
}
