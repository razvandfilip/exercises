package com.razvan;

import static org.junit.Assert.assertThat;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class AppTest {

    @Test
    public void test1() {
        int[] array = {2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
        int target = 5;
        CountDuplicates countDuplicates = new CountDuplicates(array, target);
        int result = countDuplicates.count();
        assertThat(result, is(3));
    }

    @Test
    public void test2() {
        int[] array = {2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
        int target = 6;
        CountDuplicates countDuplicates = new CountDuplicates(array, target);
        int result = countDuplicates.count();
        assertThat(result, is(2));
    }
}
