package com.razvan;

public class BinarySearch {
    private final int[] array;
    private final int number;
    private final boolean iterative;

    public BinarySearch(int[] array, int number, boolean iterative) {
        this.array = array;
        this.number = number;
        this.iterative = iterative;
    }

    public String search() {
        if (array == null || array.length == 0) {
            return "Element not found";
        }
        return iterative ? iterative() : recursive();
    }

    private String iterative() {
        int left = 0;
        int right = array.length - 1;
        

        while (left <= right) {
            int mid = (left + right) / 2;

            if (array[mid] == number) {
                return "Element found at index " + mid;
            }

            if (number < array[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return "Element not found";
    }

    private String recursive() {
        return recursiveCall(0, array.length - 1);
    }

    private String recursiveCall(int left, int right) {

        if (left > right) {
            return "Element not found";
        }

        int mid = (left + right) / 2;

        if (array[mid] == number) {
            return "Element found at index " + mid;
        }

        if (number < array[mid]) {
            return recursiveCall(left, right - 1);
        } else {
            return recursiveCall(left + 1, right);
        }
    }
}
