package com.razvan;

public class Increment {
    private final int number;

    public Increment(int number) {
        this.number = number;
    }

    public int next() {
        return -(~number);
    }

    public int prev() {
        return ~(-number);
    }
}