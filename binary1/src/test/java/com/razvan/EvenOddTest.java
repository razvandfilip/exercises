package com.razvan;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

public class EvenOddTest {
    
    @Test
    public void testZero() {
        EvenOdd evenOdd = new EvenOdd(0);
        assertThat(evenOdd.isEven(), is(true));
    }

    @Test
    public void testOne() {
        EvenOdd evenOdd = new EvenOdd(1);
        assertThat(evenOdd.isEven(), is(false));
    }

    @Test
    public void testFive() {
        EvenOdd evenOdd = new EvenOdd(5);
        assertThat(evenOdd.isEven(), is(false));
    }

    @Test
    public void testEight() {
        EvenOdd evenOdd = new EvenOdd(8);
        assertThat(evenOdd.isEven(), is(true));
    }
}
