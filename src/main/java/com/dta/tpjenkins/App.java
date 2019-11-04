package com.dta.tpjenkins;

public class App
{
    public static void main( String[] args )
    {
        run();
    }

    public static void run() {
        int a = 12;
        int b = 4;
        int sumAB = sum(a, b);
        int multipleAB = multiplication(a, b);
        float divideAB = divide(a, b);
        int subAB = sub(a, b);

    }

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
