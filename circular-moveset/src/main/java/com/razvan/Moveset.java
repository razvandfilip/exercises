package com.razvan;

public class Moveset {
    private final String input;

    public Moveset(String input) {
        this.input = input;
    }

    public boolean isCircular() {

        int direction = 0;
        int x = 0;
        int y = 0;
        int[] mx = {1, 0, -1, 0};
        int[] my = {0, -1, 0, 1};

        for (int i = 0; i < input.length(); i++) {
            switch (input.charAt(i)) {
                case 'M':
                    x += mx[direction];
                    y += my[direction];
                    break;
                case 'R':
                    direction = turnRight(direction);
                    break;
                case 'L':
                    direction = turnLeft(direction);
                    break;
            }
        }
        
        return x == 0 && y == 0;
    }

    private int turnRight(int direction) {
        return direction == 3 ? 0 : direction + 1;
    }

    private int turnLeft(int direction) {
        return direction == 0 ? 3 : direction - 1;
    }
}