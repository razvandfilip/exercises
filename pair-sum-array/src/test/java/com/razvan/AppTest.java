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
    public void testEmpty() {
        App app = new App(null, 0);
        assertTrue(app.findSum() == null);
    }

    @Test
    public void firstTest() {
        App app = new App(new int[] {8, 7, 2, 5, 3, 1}, 10);
        Pair p = app.findSum();
        assertTrue((p.getFirst() + p.getSecond()) == 10);
    }

    @Test
    public void secondTest() {
        App app = new App(new int[] {5, 2, 6, 8, 1, 9}, 12);
        assertTrue(app.findSum() == null);
    }
}
