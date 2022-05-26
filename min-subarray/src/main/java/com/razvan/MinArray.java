package com.razvan;

public class MinArray {
    private final int[] array;
    private final int size;

    public MinArray(int[] array, int size) {
        this.array = array;
        this.size = size;
    }

    public Result calculateMinimumSubarray() {

        SlidingWindow slidingWindow = new SlidingWindow(array, 0, size);
        int sum = slidingWindow.getSum();
        
        Result result = new Result(size, 0, size - 1);

        for (int i = 1; i < array.length - size + 1; i++) {
            slidingWindow.slide();
            if (slidingWindow.getSum() < sum) {
                sum = slidingWindow.getSum();
                result = new Result(size, i, i + size - 1);
            }
        }

        return result;
    }

}
