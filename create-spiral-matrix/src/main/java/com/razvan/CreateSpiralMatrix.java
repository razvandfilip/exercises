package com.razvan;

public class CreateSpiralMatrix {
    private final int[] array;
    private final int m;
    private final int n;

    public CreateSpiralMatrix(int[] array, int m, int n) {
        this.array = array;
        this.m = m;
        this.n = n;
    }

    public int[][] create() {
        int[][] matrix = new int[m][n];
        // int[][] matrix = 
        //     {{1,2,3,4,5},
        //     {16,17,18,19,6},
        //     {15,24,25,20,7},
        //     {14,23,22,21,8},
        //     {13,12,11,10,9}};

        It it = new It(array);

        int top = 0;
        int left = 0;
        int right = n - 1;
        int bottom = m - 1;

        ex:
        while (true) {
            Situation determine = determine(top, left, right, bottom);
            switch (determine) {
                case DONE:
                    break ex;
                case COLUMN:
                    for (int i = top; i <= bottom; i++) {
                        matrix[i][left] = it.get();
                    }
                    break ex;
                case LINE:
                    for (int i = left; i <= right; i++) {
                        matrix[top][i] = it.get();
                    }
                    break ex;
                case RECTANGLE:
                    for (int i = left; i <= right; i++) {
                        matrix[top][i] = it.get();
                    }
                    for (int i = top + 1; i <= bottom; i++) {
                        matrix[i][right] = it.get();
                    }
                    for (int i = right - 1; i >= left; i--) {
                        matrix[bottom][i] = it.get();
                    }
                    for (int i = bottom - 1; i >= top + 1; i--) {
                        matrix[i][left] = it.get();
                    }
                    top++;
                    left++;
                    bottom--;
                    right--;
                    break;
                case SINGLE:
                    matrix[top][left] = it.get();
                    break ex;
                default:
                    break ex;
            }
        }

        return matrix;
    }

    private Situation determine(int top, int left, int right, int bottom) {
        if (top == bottom && left == right) {
            return Situation.SINGLE;
        }
        if (top == bottom) {
            return Situation.LINE;
        }
        if (left == right) {
            return Situation.COLUMN;
        }
        if (top > bottom || left > right) {
            return Situation.DONE;
        }
        return Situation.RECTANGLE;
    }

    private static enum Situation {
        SINGLE,
        LINE,
        COLUMN,
        RECTANGLE,
        DONE
    }

    private static class It {
        private final int[] array;
        private int position;
        
        public It(int[] array) {
            this.array = array;
            position = 0;
        }

        public int get() {
            return array[position++];
        }
    }
}
