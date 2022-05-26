package com.razvan;

public class EvenOdd {
    private final int number;

    public EvenOdd(int number) {
        this.number = number;
    }
    
    public boolean isEven() {
        return (number & 1) != 1;
    }
}
