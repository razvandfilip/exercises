package com.razvan;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

public class AppTest {

    @Test
    public void testImpl() {
        int[] array = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int search = 6;

        TernarySearch t = new TernarySearch(array, search);
        int index = t.search();

        assertThat(index, is(6));
    }

    @Test
    public void shouldAnswerWithTrue() {
        int[] array = { 2, 5, 6, 8, 9, 10 };
        int search = 6;

        TernarySearch t = new TernarySearch(array, search);
        int index = t.search();

        assertThat(index, is(2));
    }

    @Test
    public void shouldAnswerWithNone() {
        int[] array = { 2, 5, 6, 8, 9, 10 };
        int search = 7;

        TernarySearch t = new TernarySearch(array, search);
        int index = t.search();

        assertThat(index, is(-1));
    }
}
