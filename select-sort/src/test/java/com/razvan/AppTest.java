package com.razvan;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public void shouldSortArray() {
        int[] array = { 9, -2, 14, 3, 20, 144, -29, 18, 22, 3 };
        App app = new App(array);
        app.sort();

        int first = array[0];
        for (int i = 1; i < array.length; i++) {
            int second = array[i];
            assertTrue(first <= second);
            first = array[i];
        }
    }

    @Test
    public void shouldSortArrayRecursively() {
        int[] array = { 9, -2, 14, 3, 20, 144, -29, 18, 22, 3 };
        App app = new App(array);
        app.recursiveSort();

        int first = array[0];
        for (int i = 1; i < array.length; i++) {
            int second = array[i];
            assertTrue(first <= second);
            first = array[i];
        }
    }
}
