package com.razvan;

public class Swap {
    private int first;
    private int second;

    public Swap(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public void swap() {
        first = first ^ second;
        second = first ^ second;
        first = first ^ second;
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }
}

/*

0010
0110

0100

0100
0110

0010

0100
0010

0110

x ^ y ^ x = y


(x ^ y) ^ y = x

z = x ^ y

x = (x ^ x) ^ y
y = (x ^ y) ^ x

x = z ^ x
y = z ^ y

x = x ^ y  (x = z)
y = x(z) ^ y

x = x(z) ^ y(x)

*/