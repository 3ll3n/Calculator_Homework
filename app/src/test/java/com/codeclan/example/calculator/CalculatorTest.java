package com.codeclan.example.calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 28/02/2017.
 */

public class CalculatorTest {

private Calculator calc;

    @Before
    public void before() {
        calc = new Calculator();
    }

    @Test
    public void testAdd() {
        assertEquals(6, calc.add(2, 4));
    }

    @Test
    public void testSubtract() {
        assertEquals(4, calc.subtract(6, 2));
    }

    @Test
    public void testMultiply() {
        assertEquals(4, calc.multiply(2, 2));
    }

    @Test
    public void testDivide() {
        assertEquals(3, calc.divide(7, 2));
    }
}
