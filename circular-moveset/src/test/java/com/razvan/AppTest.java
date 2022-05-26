package com.razvan;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

public class AppTest {

    @Test
    public void shouldAnswerWithTrue() {
        Moveset moveset = new Moveset("MRMRMRM");
        assertThat(moveset.isCircular(), is(true));
    }

    @Test
    public void shouldAnswerWithTru2() {
        Moveset moveset = new Moveset("MRMLMRMRMMRMM");
        assertThat(moveset.isCircular(), is(true));
    }
}
