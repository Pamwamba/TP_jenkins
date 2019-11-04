package com.dta.tpjenkins;
/**
 * the application that calculate basics operations.
 * @author PC
 *
 */
public class Calculator {
    /**
     * sum of two numbers.
     * @param a first parameter to addition.
     * @param b second parameter to addition.
     * @return the sum of (a + b).
     */
    public static final int sum(final int a, final int b) {
        int result = (a + b);
        return result;
    }
    /**
     * multiplication of two numbers.
     * @param a first parameter to multiply.
     * @param b second parameter to multiply.
     * @return the multiplication of a & b.
     */
    public static final int multiplication(final int a, final int b) {
        int result = (a * b);
        return result;
    }
    /**
     * division of two numbers.
     * @param a first parameter to divide.
     * @param b second parameter to divide.
     * @return the division of a & b.
     */
    public static final float divide(final int a, final int b) {
        float result = 0;
        if (b != 0) {
            result = (a / b);
        }
        return result;
    }
    /**
     * substraction of two numbers.
     * @param a first parameter to substract.
     * @param b second parameter to substract.
     * @return the sum of a & b.
     */
    public static final int sub(final int a, final int b) {
        int result = (a - b);
        return result;
    }
}
