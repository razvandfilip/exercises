package com.razvan;

public class Opposite {
    private final int first;
    private final int second;

    public Opposite(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public boolean areSignsOpposite() {
        return (first ^ second) < 0;
    }
}
