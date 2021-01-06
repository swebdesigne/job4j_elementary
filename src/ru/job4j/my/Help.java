package ru.job4j.my;

public class Help {
    void helpon(int what) {
        switch (what) {
            case '1':
                System.out.println("Instruction if:\n");
                System.out.println("if (condition) is instruction");
                System.out.println("else instruction");
                break;
            case '2':
                System.out.println("Instruction switch:\n");
                System.out.println("Switch (expression) {");
                System.out.println(" case constant:");
                System.out.println(" sequence instruction");
                System.out.println(" break;");
                System.out.println(" //...");
                break;
            case '3':
                System.out.println("Loop for:\n");
                System.out.println("for (initialization; condition; iteration)");
                System.out.println(" instruction");
                break;
            case '4':
                System.out.println("Loop while:\n");
                System.out.println("while (condition) instruction;");
                break;
            case '5':
                System.out.println("Loop do-while:\n");
                System.out.println("do {");
                System.out.println(" instruction;");
                System.out.println("} while (condition);");
                break;
            case '6':
                System.out.println("Instruction break:\n");
                System.out.println("break; or break label");
                break;
            case '7':
                System.out.println("Instruction continue:\n");
                System.out.println("continue; or continue label");
                break;
            default:
                System.out.println("Please, input the figure");
                break;
        }
        System.out.println();
    }

    void showMenu() {
        System.out.println("Reference");
        System.out.println(" 1. if");
        System.out.println(" 2. switch");
        System.out.println(" 3. for");
        System.out.println(" 4. while");
        System.out.println(" 5. do-while");
        System.out.println(" 6. break");
        System.out.println(" 7. continue");
        System.out.println(" Choice (q - exit): ");
    }

    boolean isValid(int ch) {
        if (ch < '1' | ch < 7 & ch != 'q') return false;
        else return true;
    }

}
