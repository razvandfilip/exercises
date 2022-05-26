package com.razvan;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

public class AppTest {

    @Test
    public void shouldAnswerWithTrue() {
        int[] array = {2, 3, 5, 7, 9};
        int number = 7;
        BinarySearch binarySearch = new BinarySearch(array, number, true);
        assertThat(binarySearch.search(), is("Element found at index 3"));
    }

    @Test
    public void shouldAnswerWithTrueR() {
        int[] array = {2, 3, 5, 7, 9};
        int number = 7;
        BinarySearch binarySearch = new BinarySearch(array, number, false);
        assertThat(binarySearch.search(), is("Element found at index 3"));
    }

    @Test
    public void shouldAnswerWithFalse() {
        int[] array = {1, 4, 5, 8, 9};
        int number = 2;
        BinarySearch binarySearch = new BinarySearch(array, number, true);
        assertThat(binarySearch.search(), is("Element not found"));
    }
    @Test
    public void shouldAnswerWithFalseR() {
        int[] array = {1, 4, 5, 8, 9};
        int number = 2;
        BinarySearch binarySearch = new BinarySearch(array, number, false);
        assertThat(binarySearch.search(), is("Element not found"));
    }
}
