package com.razvan;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

public class OppositeTest {
    
    @Test
    public void testEqual() {
        Opposite opposite = new Opposite(0, 0);
        assertThat(opposite.areSignsOpposite(), is(false));
    }

    @Test
    public void testEqualNegative() {
        Opposite opposite = new Opposite(-1, -1);
        assertThat(opposite.areSignsOpposite(), is(false));
    }

    @Test
    public void testPositive() {
        Opposite opposite = new Opposite(2, 11);
        assertThat(opposite.areSignsOpposite(), is(false));
    }

    @Test
    public void testNegative() {
        Opposite opposite = new Opposite(-6, -36);
        assertThat(opposite.areSignsOpposite(), is(false));
    }

    @Test
    public void testPositiveNegative() {
        Opposite opposite = new Opposite(12, -4);
        assertThat(opposite.areSignsOpposite(), is(true));
    }

    @Test
    public void testNegativePositive() {
        Opposite opposite = new Opposite(-8, 41);
        assertThat(opposite.areSignsOpposite(), is(true));
    }
}
