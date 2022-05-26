package com.razvan;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;

public class AppTest {

    @Test
    public void shouldAnswerWithTrue4() {
        ClockAngle clockAngle = new ClockAngle("00:30");
        String calculateAngle = clockAngle.calculateAngle();
        assertThat(calculateAngle, is("165°"));
    }

    @Test
    public void shouldAnswerWithTrue() {
        ClockAngle clockAngle = new ClockAngle("5:30");
        String calculateAngle = clockAngle.calculateAngle();
        assertThat(calculateAngle, is("15°"));
    }

    @Test
    public void shouldAnswerWithTrue2() {
        ClockAngle clockAngle = new ClockAngle("21:00");
        String calculateAngle = clockAngle.calculateAngle();
        assertThat(calculateAngle, is("90°"));
    }

    @Test
    public void shouldAnswerWithTrue3() {
        ClockAngle clockAngle = new ClockAngle("12:00");
        String calculateAngle = clockAngle.calculateAngle();
        assertThat(calculateAngle, is("0°"));
    }
}
