package com.dta.tpjenkins;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.dta.tpjenkins.Calculator;

public class CalculatorTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testSum() {
        int a = 1;
        int b = 2;
        int expected = 3;

        Calculator calc = new Calculator();
        int actual = calc.sum(a, b);
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void testMultiplication() {
        int a = 4;
        int b =2;
        int expected = 8;

        Calculator calc = new Calculator();
        int actual = calc.multiplication(a, b);
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void testDivide() {
        int a = 4;
        int b = 2;
        float expected = 2;

        Calculator calc = new Calculator();
        float actual = calc.divide(a, b);
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void testSub() {
        int a = 4;
        int b = 2;
        int expected = 2;

        Calculator calc = new Calculator();
        int actual = calc.sub(a, b);
        Assert.assertEquals(expected, actual, 0);
    }

}
