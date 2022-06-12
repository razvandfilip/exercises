package com.razvan;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

public class AppTest {

    @Test
    public void testRecursiveLookup() {
        Lookup lookup = new RecursiveLookup(8);
        assertThat(lookup.get(), is(21));
    }

    @Test
    public void testIterativeLookup() {
        Lookup lookup = new IterativeLookup(8);
        assertThat(lookup.get(), is(21));
    }
}
