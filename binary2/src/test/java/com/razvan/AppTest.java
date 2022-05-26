package com.razvan;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

public class AppTest {
    @Test
    public void shouldTurnOffBit() {
        Binary binary = new Binary(20);
        assertThat(binary.turnOffBit(3), is(16));
    }

    @Test
    public void shouldTurnOnBit() {
        Binary binary = new Binary(20);
        assertThat(binary.turnOnBit(4), is(28));
    }

    @Test
    public void shouldSayIsBitSet() {
        Binary binary = new Binary(20);
        assertThat(binary.isBitSet(3), is(true));
    }

    @Test
    public void shouldSayIsBitSet2() {
        Binary binary = new Binary(20);
        assertThat(binary.isBitSet(2), is(false));
    }

    @Test
    public void shouldToggleBit() {
        Binary binary = new Binary(20);
        assertThat(binary.toggleBit(3), is(16));
    }

    @Test
    public void shouldToggleBit2() {
        Binary binary = new Binary(20);
        assertThat(binary.toggleBit(2), is(22));
    }
}
