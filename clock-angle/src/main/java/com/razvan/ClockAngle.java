package com.razvan;

public class ClockAngle {
    private final String inputTime;

    public ClockAngle(String inputTime) {
        this.inputTime = inputTime;
    }

    public String calculateAngle() {
        Time time = Time.fromString(inputTime);

        System.out.println(time.getHours());
        System.out.println(time.getMinutes());

        int actualHours = time.getHours() >= 12 ? time.getHours() - 12 : time.getHours();

        int angleMinutesFromZero = time.getMinutes() * 6;

        System.out.println("Angle for minutes hand: " + angleMinutesFromZero + "°");

        int angleJustHoursFromZero = actualHours * 30;
        int angleHoursFromMinutes = time.getMinutes() / 2;
        int angleHoursFromZero = angleJustHoursFromZero + angleHoursFromMinutes;

        int angle12HoursFromZero = angleHoursFromZero >= 360 ? angleHoursFromZero - 360 : angleHoursFromZero;

        System.out.println("Angle for hours hand: " + angle12HoursFromZero + "°");

        int difference = angle12HoursFromZero - angleMinutesFromZero;
        System.out.println("difference:" + difference);
        int absoluteDifference = difference < 0 ? difference * (-1) : difference;
        System.out.println("abs difference:" + absoluteDifference);
        int finalDifference = absoluteDifference >= 180 ? absoluteDifference - 180 : absoluteDifference;
        System.out.println("fin difference:" + finalDifference);

        System.out.println();
        return finalDifference + "°";
    }
}
