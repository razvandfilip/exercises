package com.razvan;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import java.util.List;

import org.junit.Test;

public class AppTest {

    @Test
    public void shouldAnswerWithTrue() {
        List<Activity> allActivities = List.of(
                new Activity(1, 4),
                new Activity(3, 5),
                new Activity(0, 6),
                new Activity(5, 7),
                new Activity(3, 8),
                new Activity(5, 9),
                new Activity(6, 10),
                new Activity(8, 11),
                new Activity(8, 12),
                new Activity(2, 13),
                new Activity(12, 14));
        List<Activity> expectedActivity = List.of(
                new Activity(1, 4),
                new Activity(5, 7),
                new Activity(8, 11),
                new Activity(12, 14));

        ActivitySelection activitySelection = new ActivitySelection(allActivities);
        List<Activity> result = activitySelection.select();

        assertThat(result, is(expectedActivity));
    }
}
