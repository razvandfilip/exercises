package com.razvan;

/**
 * Hello world!
 *
 */
public class App 
{
    private int[] array;

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public App(int[] array) {
        this.array = array;
    }

    public void sort() {
        
        for (int i = 0; i < array.length - 1; i++) {
            int currentMinimum = array[i];
            int currentMinimumPosition = i;
            for (int j = i + 1; j < array.length; j++) {
               if (array[j] < currentMinimum) {
                   currentMinimum = array[j];
                   currentMinimumPosition = j;
               }
            }
            if (currentMinimumPosition != i) {
                array[currentMinimumPosition] = array[i];
                array[i] = currentMinimum;
            }
        }
    }

    public void recursiveSort() {
        recurse(0); 
    }

    private void recurse(int start) {
        if (start < array.length - 1) {
            int minimumPosition = start;
            for (int i = start + 1; i < array.length; i++) {
                if (array[i] < array[minimumPosition]) {
                    minimumPosition = i;
                }
            }
            if (array[start] > array[minimumPosition]) {
                int swap = array[start];
                array[start] = array[minimumPosition];
                array[minimumPosition] = swap;
            }
            recurse(start + 1);
        }
    }
}
