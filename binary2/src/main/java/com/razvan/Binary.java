package com.razvan;

public class Binary {
    private final int number;

    public Binary(int number) {
        this.number = number;
    }

    public int turnOffBit(int bitNumber) {

        System.out.println("Original Number: " + Integer.toBinaryString(number));

        System.out.println("One, binary: " + Integer.toBinaryString(1));

        System.out.println("One, shifted once: " + Integer.toBinaryString(1 << 1));

        System.out.println("One, shifted twice: " + Integer.toBinaryString(1 << 2));

        System.out.println("One, shifted "+ bitNumber + " times: " + Integer.toBinaryString(1 << bitNumber));

        System.out.println("One, shifted "+ bitNumber + "-1 times: " + Integer.toBinaryString(1 << (bitNumber - 1)));

        System.out.println("One, shifted "+ bitNumber + "-1 times, complement: " + Integer.toBinaryString(~(1 << (bitNumber - 1))));

        System.out.println("One, shifted "+ bitNumber + "-1 times, complement, then binary AND with original number: " + Integer.toBinaryString(number & (~(1 << (bitNumber - 1)))));

        return number & ~(1 << (bitNumber - 1));
    }

    public int turnOnBit(int bitNumber) {

        System.out.println("Original Number: " + Integer.toBinaryString(number));

        System.out.println("One, binary: " + Integer.toBinaryString(1));

        System.out.println("One, shifted once: " + Integer.toBinaryString(1 << 1));

        System.out.println("One, shifted twice: " + Integer.toBinaryString(1 << 2));

        System.out.println("One, shifted "+ bitNumber + " times: " + Integer.toBinaryString(1 << bitNumber));

        System.out.println("One, shifted "+ bitNumber + "-1 times: " + Integer.toBinaryString(1 << (bitNumber - 1)));

        System.out.println("One, shifted "+ bitNumber + "-1 times, then binary OR with original number: " + Integer.toBinaryString(number | (1 << (bitNumber - 1))));

        return number | (1 << (bitNumber - 1));
    }

    public boolean isBitSet(int bitNumber) {
        return (number & (1 << (bitNumber - 1))) != 0;
    }

    public int toggleBit(int bitNumber) {

        System.out.println("Original Number: " + Integer.toBinaryString(number));

        System.out.println("One, shifted "+ bitNumber + "-1 times: " + Integer.toBinaryString(1 << (bitNumber - 1)));

        System.out.println("One, shifted "+ bitNumber + "-1 times, then XOR with original number: " + Integer.toBinaryString(number ^ (1 << (bitNumber - 1))));

        return number ^ (1 << (bitNumber - 1));
    }
}
