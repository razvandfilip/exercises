package com.razvan;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

public class SwapTest {
    
    @Test
    public void swapOneTwo() {
        Swap swap = new Swap(1, 2);
        swap.swap();
        assertThat(swap.getFirst(), is(2));
        assertThat(swap.getSecond(), is(1));
    }

    @Test
    public void swapFiveMinusTen() {
        Swap swap = new Swap(5, -10);
        swap.swap();
        assertThat(swap.getFirst(), is(-10));
        assertThat(swap.getSecond(), is(5));
    }
}
