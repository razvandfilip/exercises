package com.razvan;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hamcrest.core.IsEqual;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void shouldProduceSolutions() {
        int problemSize = 8;
        var solutionCount = Map.of(
            4, 2,
            5, 10,
            6, 4,
            7, 40,
            8, 92,
            9, 352,
            10, 724
        );

        App app = new App(problemSize);
        List<boolean[][]> outputSolutions = app.outputSolutions();
        // count solutions
        assertThat(outputSolutions.size(), IsEqual.equalTo(solutionCount.get(problemSize)));
        // validate individual solutions   

        for (boolean[][] solution : outputSolutions) {
            validateNumberOfQueens(solution, problemSize);
            validateRows(solution);
            validateColumns(solution);
            validateDiagonals(solution);
        }
    }

    private void validateRows(boolean[][] solution) {
        int size = solution.length;
        for (int i = 0; i < size; i++) {
            int tally = 0;
            for (int j = 0; j < size; j++) {
                tally += solution[i][j] ? 1 : 0;
            }
            assertEquals(1, tally);
        }
    }

    private void validateColumns(boolean[][] solution) {
        int size = solution.length;
        for (int i = 0; i < size; i++) {
            int tally = 0;
            for (int j = 0; j < size; j++) {
                tally += solution[j][i] ? 1 : 0;
            }
            assertEquals(1, tally);
        }
    }

    private void validateDiagonals(boolean[][] solution) {
        int size = solution.length;
        for (int i = size - 1; i > 0; i--) {
            int tally = 0;
            for (int j = 0; j < size - i; j ++) {
                tally += solution[i + j][j] ? 1 : 0;
            }
            assertTrue(tally <= 1);
        }
        for (int i = 0; i < size; i++) {
            int tally = 0;
            for (int j = 0; j < size - i; j++) {
                tally += solution[j][i + j] ? 1 : 0;
            }
            assertTrue(tally <= 1);
        }
        for (int i = 0; i < size; i++) {
            int tally = 0;
            for (int j = 0; j <= i; j ++) {
                tally += solution[j][i - j] ? 1 : 0;
            }
            assertTrue(tally <= 1);
        }
        for (int i = 1; i < size; i++) {
            int tally = 0;
            for (int j = i; j < size; j++) {
                tally += solution[j][size - j + i - 1] ? 1 : 0;
            }
            assertTrue(tally <=1);
        }
    }

    private void validateNumberOfQueens(boolean[][] solution, int problemSize) {
        int tally = 0;
        for (boolean[] row : solution) {

            for (boolean spot : row) {
                tally += spot ? 1 : 0;
            }
        }
        assertEquals(problemSize, tally);
    }
}
