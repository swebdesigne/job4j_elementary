package ru.job4j.my;

public class MyClass {
    int x;

    MyClass() {
        System.out.println("Inside MycLass().");
        this.x = 0;
    }

    MyClass(int i) {
        System.out.println("Inside MyClass(int i).");
        this.x = i;
    }

    MyClass(double i) {
        System.out.println("Inside MyClass(double i).");
        this.x = (int) i;
    }

    MyClass(int i, int j) {
        System.out.println("Inside MyClass(int i, int j).");
        this.x = i * j;
    }

    @Override
    public String toString() {
        return "MyClass{"
                + "x=" + x
                + '}';
    }

    public static void main(String[] args) {
        MyClass myClass1 = new MyClass();
        System.out.println(myClass1);
        MyClass myClass2 = new MyClass(1);
        System.out.println(myClass2);
        MyClass myClass3 = new MyClass(17.23);
        System.out.println(myClass3);
        MyClass myClass4 = new MyClass(2, 4);
        System.out.println(myClass4);
    }
}
