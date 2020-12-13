package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number){
        if (number == 0 || number == 1) {
            return false;
        }
        boolean prime = false;
        for (int index = 2; index <= number; index++) {
            if (number % index == 0 && number != index) {
                break;
            } else if (number % index == 0) {
                prime = true;
                break;
            }
        }
        return prime;
    }
}
