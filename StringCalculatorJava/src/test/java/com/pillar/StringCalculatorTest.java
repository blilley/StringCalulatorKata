package com.pillar;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StringCalculatorTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void add_nullString_ThrowsException() {
        thrown.expect(RuntimeException.class);
        thrown.expectMessage("Invalid Input");

        StringCalculator.add(null);
    }

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

    @Test
    public void add_twoNumbers_ReturnsSum(){
        Integer result = StringCalculator.add("1,2");
        assertThat(result, is(3));
    }

    @Test
    public void add_threeNumbers_ReturnsSum(){
        Integer result = StringCalculator.add("1, 1, 1");
        assertThat(result, is(3));
    }

    @Test
    public void add_twoNumbersWithNewLine_ReturnsSum() {
        Integer result = StringCalculator.add("1\n2,3");
        assertThat(result, is(6));
    }

    @Test
    public void add_twoNumbersWithNewDelimeter_ReturnsSum() {
        Integer result = StringCalculator.add("//;\n1;2");
        assertThat(result, is(3));
    }
}
