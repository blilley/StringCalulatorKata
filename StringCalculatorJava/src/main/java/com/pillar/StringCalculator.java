package com.pillar;

import com.google.common.base.CharMatcher;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;

import java.util.List;

public class StringCalculator {
    public static Integer add(String numbers) {
        Guard.notNull(numbers);

        List<String> delimiters = getNewDelimiters(numbers);

        Splitter splitter = Splitter.on(CharMatcher.anyOf(String.join("", delimiters)))
                .trimResults();

        return splitter.splitToList(numbers)
                .stream()
                .mapToInt(StringCalculator::parseIntegers)
                .sum();
    }

    private static List<String> getNewDelimiters(String numbers) {
        if(!numbers.startsWith("//"))
            return Lists.newArrayList(",", "\n");

        String delimiter = numbers.substring(2, numbers.indexOf("\n") - 1);

        return Lists.newArrayList(delimiter);
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
