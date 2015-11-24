package com.pillar;

public class StringCalculator {
    public static Integer add(String numbers) {
        if(numbers.isEmpty())
            return 0;
        Integer sum = Integer.parseInt(numbers);
        return sum;
    }
}
