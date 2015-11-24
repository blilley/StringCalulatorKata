package com.pillar;

import com.google.common.base.CharMatcher;
import com.google.common.base.Splitter;

public class StringCalculator {
    public static Integer add(String numbers) {
        Guard.notNull(numbers);

        Splitter splitter = Splitter.on(CharMatcher.anyOf(","));

        return splitter.splitToList(numbers)
                .stream()
                .mapToInt(StringCalculator::parseIntegers)
                .sum();
    }

    private static Integer parseIntegers(String value) {
        try {
            return Integer.parseInt(value);
        }
        catch (Exception ignored){
            return 0;
        }
    }

    private static class Guard {
        public static void notNull(String numbers) {
            if (numbers == null)
                throw new RuntimeException("Invalid Input");
        }
    }
}
