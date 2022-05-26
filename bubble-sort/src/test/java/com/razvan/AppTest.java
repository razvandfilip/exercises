package com.razvan;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

public class AppTest {

    @Test
    public void shouldAnswerWithTrue() {

        int[] array = { 3, 5, 8, 4, 1, 9, -2 };
        int[] expected = { -2, 1, 3, 4, 5, 8, 9 };

        BubbleSort bubbleSort = new BubbleSort(array);
        bubbleSort.sort(true);

        assertThat(bubbleSort.getArray(), is(expected));
    }

    @Test
    public void shouldAnswerWithTrueRec() {

        int[] array = { 3, 5, 8, 4, 1, 9, -2 };
        int[] expected = { -2, 1, 3, 4, 5, 8, 9 };

        BubbleSort bubbleSort = new BubbleSort(array);
        bubbleSort.sort(false);

        assertThat(bubbleSort.getArray(), is(expected));
    }
}
