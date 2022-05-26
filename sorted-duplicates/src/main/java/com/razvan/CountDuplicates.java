package com.razvan;

public class CountDuplicates {
    private final int[] array;
    private final int target;

    public CountDuplicates(int[] array, int target) {
        this.array = array;
        this.target = target;
    }

    public int count() {
        return smartSolution();
    }

    private int smartSolution() {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = (right + left) / 2;
            if (array[mid] == target) {
                int leftEdge = binarySearch(target, true, left, right, mid);
                int rightEdge = binarySearch(target, false, left, right, mid);
                return rightEdge - leftEdge + 1;
            } else {
                if (target < array[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return 0;
    }
    private int binarySearch(int target, boolean start, int left, int right, int mid) {
        int result = mid;
        while (left <= right) {
            mid = (right + left) / 2;
            if (array[mid] == target) {
                if (start) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
                result = mid;
            } else {
                if (target < array[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return result;
    }

    private int binarySearchSolution() {
        int position = binarySearch(target);
        if (position == -1) {
            return 0;
        }
        int count = 0;

        for (int i = position; array[i] == target && i < array.length; i++) {
            count++;
        }

        for (int i = position - 1; array[i] == target && i >= 0; i--) {
            count++;
        }

        return count;
    }

    

    private int binarySearch(int target) {

        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = (right + left) / 2;
            if (array[mid] == target) {
                return mid;
            } else {
                if (target < array[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }

        return -1;
    }

    private int simpleSolution() {
        int count = 0;
        for (int number : array) {
            if (number == target) {
                count++;
            }
        }
        return count;
    }
}

// [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]