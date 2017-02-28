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
    public void addNumbers() {
        assertEquals(6, calc.addNumbers(2, 4));
    }
}
