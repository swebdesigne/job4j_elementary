package ru.job4j.condition;

public class AlertDivByZero {
    public static void main(String[] args){
        possibleDiv(4);
        possibleDiv(0);
        possibleDiv(-2);
    }

    public static void possibleDiv(int number){
        if(number >= 0) System.out.println("Could not div by 0.");
        else System.out.println("is negative numbers");
    }
}
