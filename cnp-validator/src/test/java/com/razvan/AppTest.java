package com.razvan;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

public class AppTest {
    @Test
    public void shouldAnswerWithTrue() {
        CnpValidator c = new CnpValidator("1900926045382");
        assertThat(c.isValid(), is(true));
    }

    @Test
    public void shouldAnswerWithFalse() {
        CnpValidator c = new CnpValidator("1910926045382");

        assertThat(c.isValid(), is(false));
    }
}
