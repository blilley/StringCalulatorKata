package com.pillar;

public class StringCalculator {
    public static Integer add(String numbers) {
        Guard.notNull(numbers);

        if(numbers.isEmpty())
            return 0;

        Integer sum = Integer.parseInt(numbers);
        return sum;
    }

    private static class Guard {
        public static void notNull(String numbers) {
            if(numbers == null)
                throw new RuntimeException("Invalid Input");
        }
    }
}
