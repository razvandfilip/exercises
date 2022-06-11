package com.razvan;

public class MoveZeroes {
    private final int[] array;

    public MoveZeroes(int[] array) {
        this.array = array;
    }

    public void move() {
        int zeroCount = 0;

        for (int i = array.length - 1, k = array.length - 1; i >= 0; i--) {
            if (array[i] == 0) {
                zeroCount++;
            } else {
                array[k] = array[i];
                k--;
            }
        }

        if (zeroCount < array.length) {
            for (int i = 0; i < zeroCount; i++) {
                array[i] = 0;
            }
        }
    }
}
