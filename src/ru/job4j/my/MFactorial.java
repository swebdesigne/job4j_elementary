package ru.job4j.my;

public class MFactorial {
    int factR(int n) {
        int result;
        if (n == 1) return 1;
        result = factR(n - 1) * n;
        System.out.println("n = " + n + "\nresult = " + result);
        return result;
    }

    int factI(int n) {
        int t, result;
        result = 1;
        for (t = 1; t <= n; t++) {
            result *= t;
        }
        return t;
    }

    public static void main(String[] args) {
        int fact = 1;
        for (int i = 1; i <= 3; ++i) {
            fact *= i;
        }
//        System.out.println(fact);
        System.out.println(new MFactorial().factR(5));
    }
}
