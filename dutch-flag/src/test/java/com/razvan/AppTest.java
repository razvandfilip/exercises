package com.razvan;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest {

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);

        int[] array = { 0, 1, 2, 2, 1, 0, 0, 2, 0, 1, 1, 0 };
        int[] expectedArray = { 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2 };

        DutchFlag dutchFlag = new DutchFlag(array);
        dutchFlag.sort();

        for (int i = 0; i < array.length; i++) {
            assertTrue(array[i] == expectedArray[i]);
        }
    }
}
