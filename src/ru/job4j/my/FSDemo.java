package ru.job4j.my;

public class FSDemo {
    public static void main(String[] args) {
        FailSoftArray fs = new FailSoftArray(5, -1);
        int x;

        System.out.println("Обработка ошибок без вывода отчета");
        for (int i = 0; i < (fs.length * 2); i++) {
            x = fs.get(i);
            if (x != -1) System.out.println(x + " ");
        }
        System.out.println("");
        System.out.println("\nОбработа ошибок с выводом отчета");
        for (int i = 0; i < (fs.length * 2); i++) {
            if (!fs.put(i, i * 10)) {
                System.out.println("Индекс " + i + " вне допустимого диапазона");
            }
            for (int j = 0; j < (fs.length * 2); j++) {
                x = fs.get(j);
                if (x != -1) System.out.println(x + " ");
                else System.out.println("Индекс " + i + " вне диапазона");
            }
        }
    }
}
