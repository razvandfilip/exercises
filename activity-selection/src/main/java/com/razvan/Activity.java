package com.razvan;

public class Activity {

    private final int start;
    
    private final int end;

    public Activity(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", start, end);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }

        Activity o = (Activity) other;
        return 
            this.start == o.start &&
            this.end == o.end;
    }

    @Override
    public int hashCode() {
        return start * 31 + end;
    }
}
