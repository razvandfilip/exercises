package com.razvan;

import java.util.HashMap;
import java.util.Map;

public class RecursiveLookup implements Lookup {
    private final int n;
    private final Map<Integer, Integer> lookup;

    public RecursiveLookup(int n) {
        this.n = n;
        lookup = new HashMap<>();
    }

    @Override
    public int get() {
        return recurse(n);
    }

    private int recurse(int nth) {
        if (nth <= 1) {
            return nth;
        }

        if (!lookup.containsKey(nth)) {
            lookup.put(nth, recurse(nth - 1) + recurse(nth - 2));
        }

        return lookup.get(nth);
    }
}
