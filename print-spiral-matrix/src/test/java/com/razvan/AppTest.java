package com.razvan;

import static org.junit.Assert.assertEquals;
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
    public void shouldPrintInSpiral() {
        int[][] matrix =
        {
            { 1,  2,  3,  4, 5},
            {16, 17, 18, 19, 6},
            {15, 24, 25, 20, 7},
            {14, 23, 22, 21, 8},
            {13, 12, 11, 10, 9}
        };
        String expected = "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 ";

        App app = new App(matrix);
        String result = app.printInSpiral();

        assertEquals(expected, result);
    }

    @Test
    public void shouldPrintInSpiral2() {
        int[][] matrix =
        {
            { 1,  2,  3,  4, 5},
            {16, 17, 18, 19, 6},
            {15, 24, 25, 20, 7}
        };
        String expected = "1 2 3 4 5 6 7 20 25 24 15 16 17 18 19 ";

        App app = new App(matrix);
        String result = app.printInSpiral();

        assertEquals(expected, result);
    }

    @Test
    public void shouldPrintInSpiral3() {
        int[][] matrix =
        {
            { 1,  2,  3,},
            {16, 17, 18,},
            {15, 24, 25,},
            {14, 23, 22,},
            {13, 12, 11}
        };
        String expected = "1 2 3 18 25 22 11 12 13 14 15 16 17 24 23 ";

        App app = new App(matrix);
        String result = app.printInSpiral();

        assertEquals(expected, result);
    }

    @Test
    public void shouldPrintInSpiral4() {
        int[][] matrix =
        {
            { 1 }
        };
        String expected = "1 ";

        App app = new App(matrix);
        String result = app.printInSpiral();

        assertEquals(expected, result);
    }
}
