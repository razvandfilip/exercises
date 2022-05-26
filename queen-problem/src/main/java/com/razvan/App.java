package com.razvan;

import java.util.ArrayList;
import java.util.List;

/** 
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    private int size;

    public App(int size) {
        this.size = size;
    }

    public List<boolean[][]> outputSolutions() {

        // if (size == 4) {
        //     List<boolean[][]> hard = new ArrayList<>();
        //     boolean[][] s1 = {{false, false, true, false}, 
        //                       {true, false, false, false},
        //                       {false, false, false, true},
        //                       {false, true, false, false}};
        //     boolean[][] s2 = {{false, true, false, false},
        //                       {false, false, false, true},
        //                       {true, false, false, false},
        //                       {false, false, true, false}};
        //     hard.add(s1);
        //     hard.add(s2);
        //     return hard;
        // }
        
        return recursiveSolution();
    }

    private List<boolean[][]> recursiveSolution() {
        int[] queens = new int[size];
        List<boolean[][]> solutions = new ArrayList<>();
        recursiveBacktracking(queens, 0, solutions);
        return solutions;
    }

    private void recursiveBacktracking(int[] queens, int currentRow, List<boolean[][]> solutionAccumulator) {
        if (currentRow == size) {
            solutionAccumulator.add(outputSolution(queens));
        }
        for (int i = 0; i < size; i++) {
            boolean valid = true;

            for (int j = 0; j < currentRow; j++) {
                if (queens[j] == i || (j - queens[j] == currentRow - i) || (j + queens[j] == currentRow + i)) {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                queens[currentRow] = i;
                recursiveBacktracking(queens, currentRow + 1, solutionAccumulator);
            }
        }
    }

    private boolean[][] outputSolution(int[] queens) {
        boolean[][] solution = new boolean[queens.length][queens.length];

        for (int i = 0; i < solution.length; i++) {
            for (int j = 0; j < solution.length; j++) {
                solution[i][j] = false;
            }
        }

        for (int i = 0; i < queens.length; i++) {
            solution[i][queens[i]] = true;
        }

        for (int i = 0; i < solution.length; i++) {
            for (int j = 0; j < solution.length; j++) {
                System.out.print(solution[i][j] ? "Q" : ((i + j) % 2 == 0 ? "+" : "*"));
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();

        return solution;
    }
}
