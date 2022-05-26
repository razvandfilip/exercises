package com.razvan;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;

public class AppTest {

    @Test
    public void shouldAnswerWithTrue() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25};
        int m = 5;
        int n = 5;

        CreateSpiralMatrix createSpiralMatrix = new CreateSpiralMatrix(array, m, n);
        int[][] create = createSpiralMatrix.create();
        int[] result = map(create, m, n);

        int[] expectedResult = {1,2,3,4,5,16,17,18,19,6,15,24,25,20,7,14,23,22,21,8,13,12,11,10,9};
        assertThat(result, is(expectedResult));
    }

    @Test
    public void testSingle() {
        int[] array = {1};
        int m = 1;
        int n = 1;

        CreateSpiralMatrix createSpiralMatrix = new CreateSpiralMatrix(array, m, n);
        int[][] create = createSpiralMatrix.create();
        int[] result = map(create, m, n);

        int[] expectedResult = {1};
        assertThat(result, is(expectedResult));
    }

    @Test
    public void testLine() {
        int[] array = {1, 2, 3, 4, 5};
        int m = 1;
        int n = 5;

        CreateSpiralMatrix createSpiralMatrix = new CreateSpiralMatrix(array, m, n);
        int[][] create = createSpiralMatrix.create();
        int[] result = map(create, m, n);

        int[] expectedResult = {1,2,3,4,5};
        assertThat(result, is(expectedResult));
    }

    @Test
    public void testColumn() {
        int[] array = {1, 2, 3, 4, 5};
        int m = 5;
        int n = 1;

        CreateSpiralMatrix createSpiralMatrix = new CreateSpiralMatrix(array, m, n);
        int[][] create = createSpiralMatrix.create();
        int[] result = map(create, m, n);

        int[] expectedResult = {1,2,3,4,5};
        assertThat(result, is(expectedResult));
    }

    @Test
    public void testSimple() {
        int[] array = {1, 2, 3, 4};
        int m = 2;
        int n = 2;

        CreateSpiralMatrix createSpiralMatrix = new CreateSpiralMatrix(array, m, n);
        int[][] create = createSpiralMatrix.create();
        int[] result = map(create, m, n);

        int[] expectedResult = {1,2,4,3};
        assertThat(result, is(expectedResult));
    }

    private int[] map(int[][] matrix, int m, int n) {
        int[] array = new int[m*n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i * n + j] = matrix[i][j];
            }
        }
        return array;
    }
}
