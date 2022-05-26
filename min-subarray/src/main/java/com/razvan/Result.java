package com.razvan;

public class Result {
    private final int size;
    private final int leftBound;
    private final int rightBound;

    public Result(int size, int leftBound, int rightBound) {
        this.size = size;
        this.leftBound = leftBound;
        this.rightBound = rightBound;
    }

    @Override
    public String toString() {
        return "Minimum sum subarray of size " + size + " is (" + leftBound + ", " + rightBound + ")";
    }
}
