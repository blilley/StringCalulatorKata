package com.pillar;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StringCalculatorTest {
    @Test
    public void add_emptyString_Returns0(){
        Integer result = StringCalculator.add("");
        assertThat(result, is(0));
    }

    @Test
    public void add_oneNumber_ReturnsNumber() {
        Integer result = StringCalculator.add("1");
        assertThat(result, is(1));
    }
}
