package com.pillar;

public class StringCalculator {
    public static Integer add(String numbers) {
        if(numbers == null)
            throw new RuntimeException("Invalid Input");

        if(numbers.isEmpty())
            return 0;
        
        Integer sum = Integer.parseInt(numbers);
        return sum;
    }
}
