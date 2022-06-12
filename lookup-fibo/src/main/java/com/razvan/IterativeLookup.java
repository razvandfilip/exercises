package com.razvan;

public class IterativeLookup implements Lookup {
    
    private final int n;

    public IterativeLookup(int n) {
        this.n = n;
    }

    @Override
    public int get() {

        if (n <= 1) {
            return n;
        }

        int fPrevious = 1;
        int fSecondPrevious = 0;
        int fCurrent = 1;

        for (int i = 2; i <= n; i++) {
            fCurrent = fSecondPrevious + fPrevious;
            fSecondPrevious = fPrevious;
            fPrevious = fCurrent;
        }

        return fCurrent;
    }
}
