package com.razvan;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
    }

    private int[] array;
    private int sum;

    public App(int[] array, int sum) {
        this.array = array;
        this.sum = sum;
    }

    public Pair findSum() {
        if (array == null || array.length < 2) {
            return null;
        }
        return thirdSolution();
    }

    private Pair firstSolution() {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if ((array[i] + array[j]) == sum) {
                    return new Pair(array[i], array[j]);
                }
            }
        }
        return null;
    }

    private Pair secondSolution() {
        Arrays.sort(this.array);

        int low = 0;
        int high = array.length - 1;

        while (low < high) {
            if ((array[low] + array[high]) == this.sum) {
                return new Pair(array[low], array[high]);
            }

            if ((array[low] + array[high]) < this.sum) {
                low++;
            } else {
                high--;
            }
        }

        return null;
    }

    private Pair thirdSolution() {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(this.sum - array[i])) {
                return new Pair(array[i], array[map.get(this.sum - array[i])]);
            }
            map.put(array[i], i);
        }
        return null;
    }
}
