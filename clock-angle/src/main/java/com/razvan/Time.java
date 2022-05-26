package com.razvan;

public class Time {
    private final int hours;
    private final int minutes;

    private Time() {
        this(0, 0);
    }

    private Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public static Time fromString(String time) {
        String[] split = time.split(":");
        int hours = Integer.parseInt(split[0]);
        int minutes = Integer.parseInt(split[1]);
        return new Time(hours, minutes);
    }

    public int getMinutes() {
        return minutes;
    }

    public int getHours() {
        return hours;
    }
}
