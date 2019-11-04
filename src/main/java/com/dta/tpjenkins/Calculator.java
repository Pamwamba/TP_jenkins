package com.dta.tpjenkins;

public class Calculator {
    /**
     *
     * @param a
     * @param b
     * @return a + b
     */
    public final static int sum(final int a, final int b) {
        int result = (a + b);
        return result;
    }
    /**
     *
     * @param a
     * @param b
     * @return a * b
     */
    public final static int multiplication(final int a, final int b) {
        int result = (a * b);
        return result;
    }
    /**
     *
     * @param a
     * @param b
     * @return a / b
     */
    public final static float divide(final int a, final int b) {
        float result = 0;
        if (b != 0) {
            result = (a / b);
        }
        return result;
    }
    /**
     *
     * @param a
     * @param b
     * @return a - b
     */
    public final static int sub(final int a, final int b) {
        int result = (a - b);
        return result;
    }
}
