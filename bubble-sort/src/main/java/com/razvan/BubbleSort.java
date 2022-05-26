package com.razvan;

public class BubbleSort {
    private final int[] array;

    public BubbleSort(int[] array) {
        this.array = array;
    }
    
    public void sort(boolean iterative) {
        if (array == null || array.length < 2) {
            return;
        }

        if (iterative) {
            sortIterative();
        } else {
            sortRecursive();
        }
    }

    public int[] getArray() {
        return array;
    }

    private void sortIterative() {

        boolean sorted = false;

        for (int k = 0; (k < array.length - 1) || !sorted; k++) {
            boolean iterationSorted = true;
            for (int i = 0; i < array.length - 1 - k; i++) {
                if (array[i] > array[i + 1]) {
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    iterationSorted = false;
                }
            }
            sorted = iterationSorted;
        }
    }

    private void sortRecursive() {
        recursiveCall(array.length - 2);
    }

    private void recursiveCall(int untill) {
        boolean sorted = true;

        for (int i = 0; i <= untill; i++) {
            if (array[i] > array[i + 1]) {
                int tmp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = tmp;
                sorted = false;
            }
        }

        if (!sorted) {
            recursiveCall(untill - 1);
        }
    }
}
