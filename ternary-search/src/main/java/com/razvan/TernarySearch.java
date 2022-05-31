package com.razvan;

public class TernarySearch {
    private final int[] array;
    private final int search;

    public TernarySearch(int[] array, int search) {
        this.array = array;
        this.search = search;
    }

    public int search() {

        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int leftMarker = (left + right) / 3;
            int rightMarker = (left + right) * 2 / 3;
    
            if (array[leftMarker] == search) {
                return leftMarker;
            }
            if (array[rightMarker] == search) {
                return rightMarker;
            }

            if (search < array[leftMarker]) {
                right = leftMarker - 1;
            } else {
                if (array[rightMarker] < search) {
                    left = rightMarker + 1;
                } else {
                    left = leftMarker + 1;
                    right = rightMarker - 1;
                }
            }
        }

        return -1;
    }
}
