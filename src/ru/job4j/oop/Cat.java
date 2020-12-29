package ru.job4j.oop;

public class Cat {
    private String food;
    private String name;

    public static void main(String[] args) {
        Cat gav = new Cat();
        System.out.print("There are " + gav.giveNick("gav") + "`s food ");
        gav.eat("Kotleta");
        gav.show();
        Cat black = new Cat();
        System.out.print("There are " + black.giveNick("black") + "`s food ");
        black.eat("fish");
        black.show();
    }

    public void show() {
        System.out.println(this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public String giveNick(String nick) {
        this.name = nick;
        return this.name;
    }
}
