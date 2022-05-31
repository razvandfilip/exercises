package com.razvan;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

public class AppTest {

    @Test
    public void shouldAnswerWithTrue() {
        // int[] array1 = { 3, 6, 7, 8, 10, 12, 15, 18, 100 };
        // int[] array2 = { 1, 2, 3, 5, 7, 9, 10, 11, 15, 16, 18, 25, 50 };
        int[] array1 = { 2, 3, 5, 8, 12 };
        int[] array2 = { 2, 4, 6, 10, 12 };

        MaxPath maxPath = new MaxPath(array1, array2);
        List<Integer> path = maxPath.getMaxPath();

        // assertThat(path, is(Arrays.asList(1, 2, 3, 6, 7, 9, 10, 12, 15, 16, 18, 100)));
        System.out.println(path.stream()
        .map(i -> Integer.toString(i))
        .collect(Collectors.joining(",")));
        
        assertThat(path, is(Arrays.asList(2, 4, 6, 10, 12)));
        
        // int[] array3 = { 3, 6, 7, 8, 10, 12, 15, 18, 24 };
        // int[] array4 = { 1, 2, 3, 5, 7, 9, 10, 11, 15, 16, 18, 25, 50 };
    }
}
