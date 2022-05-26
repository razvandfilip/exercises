package com.razvan;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

public class IncrementTest {
    
    @Test
    public void next0() {
        Increment increment = new Increment(0);

        assertThat(increment.next(), is(1));
    }

    @Test
    public void nextMinus3() {
        Increment increment = new Increment(-3);

        assertThat(increment.next(), is(-2));
    }

    @Test
    public void next10() {
        Increment increment = new Increment(10);

        assertThat(increment.next(), is(11));
    }

    @Test
    public void prev0() {
        Increment increment = new Increment(0);

        assertThat(increment.prev(), is(-1));
    }

    @Test
    public void prevMinus3() {
        Increment increment = new Increment(-3);

        assertThat(increment.prev(), is(-4));
    }

    @Test
    public void prev10() {
        Increment increment = new Increment(10);

        assertThat(increment.prev(), is(9));
    }
}
