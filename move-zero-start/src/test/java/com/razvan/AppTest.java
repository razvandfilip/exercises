package com.razvan;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

public class AppTest {

    @Test
    public void shouldAnswerWithTrue() {
        int[] array = {10, 0, 12, -1, 0, 0, 3, 0, 2, 1};
        int[] expectedArray = {0, 0, 0, 0, 10, 12, -1, 3, 2, 1};

        MoveZeroes moveZeroes = new MoveZeroes(array);

        moveZeroes.move();

        for (int i = 0; i < array.length; i++) {
            assertThat(array[i], is(expectedArray[i]));
        }
    }

    @Test
    public void shouldAnswerWithTrue2() {
        int[] array = { 6, 0, 8, 2, 3, 0, 4, 0, 1 };
        int[] expectedArray = { 0, 0, 0, 6, 8, 2, 3, 4, 1 };

        MoveZeroes moveZeroes = new MoveZeroes(array);

        moveZeroes.move();

        for (int i = 0; i < array.length; i++) {
            assertThat(array[i], is(expectedArray[i]));
        }
    }

    @Test
    public void shouldAnswerWithTrue3() {
        int[] array = { 0, 0, 0, 0 };
        int[] expectedArray = { 0, 0, 0, 0 };

        MoveZeroes moveZeroes = new MoveZeroes(array);

        moveZeroes.move();

        for (int i = 0; i < array.length; i++) {
            assertThat(array[i], is(expectedArray[i]));
        }
    }
}
