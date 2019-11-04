package com.dta.tpjenkins;

public class Calculator {
    public static int sum(int a, int b) {
        int result = (a + b);
        return result;
    }

    public static int multiplication(int a, int b) {
        int result = (a * b);
        return result;
    }

    public static float divide(int a, int b) {
        float result = 0;
        if (b != 0) {
            result = (a / b);
        }
        return result;
    }
    public static int sub(int a, int b) {
        int result = (a - b);
        return result;
    }
}
