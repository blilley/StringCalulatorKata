package com.pillar;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
    public static Integer add(String numbers) {
        Guard.notNull(numbers);

        if (numbers.isEmpty())
            return 0;

        List<Integer> collection = new ArrayList<>();
        String[] values = numbers.split(",");
        for (String value : values) {
            collection.add(Integer.parseInt(value));
        }


        Integer sum = 0;

        for (Integer value : collection) {
            sum += value;
        }

        return sum;
    }

    private static class Guard {
        public static void notNull(String numbers) {
            if (numbers == null)
                throw new RuntimeException("Invalid Input");
        }
    }
}
