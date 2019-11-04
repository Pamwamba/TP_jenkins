package com.dta.tpjenkins;
/**
 * the application that calculate basics operations.
 * @author PC
 *
 */
public class Calculator {
    /**
     * sum of two numbers.
     * @param firstParam first parameter to addition.
     * @param secondParam second parameter to addition.
     * @return the sum of (a + b).
     */
    public static final int sum(final int firstParam, final int secondParam) {
        return firstParam + secondParam;
    }
    /**
     * multiplication of two numbers.
     * @param firstParam first parameter to multiply.
     * @param secondParam second parameter to multiply.
     * @return the multiplication of a and b.
     */
    public static final int multiplication(final int firstParam, final int secondParam) {
        return firstParam * secondParam;
    }
    /**
     * division of two numbers.
     * @param firstParam first parameter to divide.
     * @param secondParam second parameter to divide.
     * @return the division of a and b.
     */
    public static final float divide(final int firstParam, final int secondParam) {
        float result;
        if (secondParam != 0) {
            result = firstParam / secondParam;
        } else {
            result = 0;
        }
        return result;
    }
    /**
     * substraction of two numbers.
     * @param firstParam first parameter to substract.
     * @param secondParam second parameter to substract.
     * @return the sum of a and b.
     */
    public static final int sub(final int firstParam, final int secondParam) {
        return firstParam - secondParam;
    }
}
