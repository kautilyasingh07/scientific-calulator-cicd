package com.calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class CalculatorTest {

    @Test
    void testSquareRoot(){
        assertEquals(5.0, Calculator.sqrt(25), 0.001);
    }

    @Test
    void testFactorial(){
        assertEquals(120, Calculator.fact(5));
    }

    @Test
    void testNaturalLog(){
        assertEquals(Math.log(10), Calculator.naturalLog(10), 0.0001);
    }

    @Test
    void testPower(){
        assertEquals(8.0, Calculator.pow(2, 3), 0.0001);
    }
}