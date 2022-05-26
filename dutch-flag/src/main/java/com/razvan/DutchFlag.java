package com.razvan;

public class DutchFlag {
    private final int[] array;

    public DutchFlag(int[] array) {
        this.array = array;
    }

    public void sort() {
        int zeroPosition = 0;

        int unsortedLeft = 0;
        int unsortedRight = array.length - 1;

        while (unsortedLeft <= unsortedRight) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");    
            }
            System.out.println();

            for (int i = 0; i < array.length; i++) {
                System.out.print(printSymbol(i, zeroPosition, unsortedLeft, unsortedRight));
            }
            System.out.println();

            switch (array[unsortedLeft]) {
                case 0: {
                    int tmp = array[zeroPosition];
                    array[zeroPosition] = array[unsortedLeft];
                    array[unsortedLeft] = tmp;
                    zeroPosition++;
                    unsortedLeft++;
                    break;
                }
                case 1: {
                    unsortedLeft++;
                    break;
                }
                case 2: {
                    int tmp = array[unsortedRight];
                    array[unsortedRight] = array[unsortedLeft];
                    array[unsortedLeft] = tmp;
                    unsortedRight--;
                    break;
                }
                default:
                    break;
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");    
        }
        System.out.println();
    }

    private String printSymbol(int position, int zeroPosition, int unsortedLeft, int unsortedRight) {

        if (position == zeroPosition && position == unsortedLeft && position == unsortedRight) {
            return "& ";
        }

        if (position == zeroPosition && position == unsortedLeft) {
            return "{ ";
        }

        if (position == zeroPosition && position == unsortedRight) {
            return "} ";
        }

        if (position == zeroPosition) {
            return "* ";
        }

        if (position == unsortedLeft && position == unsortedRight) {
            return "| ";
        }

        if (position == unsortedLeft) {
            return "[ ";
        }

        if (position == unsortedRight) {
            return "] ";
        }

        return "  ";
    }
}
