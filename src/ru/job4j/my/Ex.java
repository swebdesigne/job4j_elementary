package ru.job4j.my;

public class Ex extends MainClass {
    public Ex() {
        super();
    }

    @Override
    public String str() {
        return  super.str() + " Igor";
    }

    public static void main(String[] args) {
        System.out.println(new Ex().str());
    }
}
