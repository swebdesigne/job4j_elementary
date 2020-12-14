package ru.job4j.condition;

public class Game {
    public static void menu(String name) {
        if (name.equals("super mario")) {
            System.out.println("start - super mario");
        } else if (name.equals("tanks")) {
            System.out.println("Start - tanks");
        } else if (name.equals("tetris")) {
            System.out.println("Start - tetris");
        } else {
            System.out.println("Don`t matches");
        }
    }

    public static void main(String[] args) {
        Game.menu("super mario");
        Game.menu("tanks");
        Game.menu("tetris");
    }
}
