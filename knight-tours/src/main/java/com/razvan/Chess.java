package com.razvan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Chess {

    public static final int BOARD_SIZE = 5;

    private final int[][] board;
    private final List<Move> moveSet;

    public Chess() {
        board = new int[BOARD_SIZE][BOARD_SIZE]; 
        moveSet = Arrays.asList(
            new Move(1, 2),
            new Move(2, 1),
            new Move(2, -1),
            new Move(1, -2),
            new Move(-1, -2),
            new Move(-2, -1),
            new Move(-2, 1),
            new Move(-1, 2)
        );

    }

    public void run() {
        int step = 1;
        recurse(step, 0, 0);
    }

    private void recurse(int step, int positionX, int positionY) {
        board[positionX][positionY] = step;
        if (step >= BOARD_SIZE * BOARD_SIZE) {
            printSolution();
            board[positionX][positionY] = 0;
            return;
        }

        for (Move m : moveSet) {
            int newX = positionX + m.getN();
            int newY = positionY + m.getE();
            if (isValid(newX, newY) && board[newX][newY] == 0) {
                recurse(step + 1, newX, newY);
            }
        }

        board[positionX][positionY] = 0;
    }

    private void printSolution() {

        Move[] list = new Move[BOARD_SIZE * BOARD_SIZE];

        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                list[board[i][j] - 1] = new Move(i, j);
            }
        }

        System.out.println(
        Arrays.stream(list)
            .map(m -> "(" + m.getN() + ", " + m.getE() + ")")
            .collect(Collectors.joining(", "))
        );

        // for (int i = 0; i < BOARD_SIZE; i++) {
        //     System.out.println(Arrays.stream(board[i])
        //         .mapToObj(n -> String.valueOf(n))
        //         .collect(Collectors.joining(", ")));
        // }
        System.out.println();
    }

    private boolean isValid(int posX, int posY) {
        return posX >= 0 && posY >= 0 && posX < BOARD_SIZE && posY < BOARD_SIZE;
    }

    private static class Move {
        private final int N;
        private final int E;

        public Move(int N, int E) {
            this.N = N;
            this.E = E;
        }

        public int getN() {
            return N;
        }

        public int getE() {
            return E;
        }
    }
}
