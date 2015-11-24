package com.pillar;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class StringCalculatorTest {
    @Test
    public void add_emptyString_Returns0(){
        Integer result = StringCalculator.add("");
    }
}
