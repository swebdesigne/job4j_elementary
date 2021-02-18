package ru.job4j.my;

public class Ex extends MainClass {
    public Ex() {
        super();
    }

    @Override
    public String str() {
        return  super.str() + " Igor";
    }

    public void str(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        System.out.println(new Ex().str());
        new Ex().str("Hello Boris");
    }
}
