package com.razvan;

public class SlidingWindow {

    private final int[] array;
    private final int size;
    private int leftBound;
    private int sum;

    public SlidingWindow(int[] array, int leftBound, int size) {
        this.array = array;
        this.leftBound = leftBound;
        this.size = size;
        int partialsSum = 0;
        for (int i = leftBound; i < size; i++) {
            partialsSum += array[i];
        }
        sum = partialsSum;
    }
    
    public void slide() {
        sum -= array[leftBound];
        leftBound++;
        sum += array[leftBound + size - 1];
    }

    public int getSum() {
        return this.sum;
    }
}