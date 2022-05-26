package com.razvan;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest {
    @Test
    public void shouldAnswerWithTrue() {

        int[] array = {10, 4, 7, 5, 6, 3, 8, 1};
        int size = 3;

        MinArray minArray = new MinArray(array, size);

        Result result = minArray.calculateMinimumSubarray();
        System.out.println(result);

        assertTrue("Minimum sum subarray of size 3 is (5, 7)".equals(result.toString()));
    }

    @Test
    public void shouldAnswerWithTrue2() {

        int[] array = {10, 4, 2, 5, 6, 3, 8, 1};
        int size = 3;

        MinArray minArray = new MinArray(array, size);

        Result result = minArray.calculateMinimumSubarray();
        System.out.println(result);

        assertTrue("Minimum sum subarray of size 3 is (1, 3)".equals(result.toString()));
    }
}
