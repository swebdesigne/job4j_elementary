package ru.job4j.my;

public class HelpClassDemo {
    public static void main(StringMy[] args) throws java.io.IOException {
        char choice, ignore;
        Help hlpobj = new Help();
        for (;;) {
            do {
                hlpobj.showMenu();
                choice = (char) System.in.read();
                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (!hlpobj.isValid(choice));
                if (choice == 'q') break;
                System.out.println("\n");
                hlpobj.helpon(choice);
        }
    }
}
