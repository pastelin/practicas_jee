package com.seccion4.temas;

public class SecondsAndMinutes {

    public static void main(String[] args) {
        System.out.println(getDurationString(160));
        System.out.println(getDurationString(1500));
        System.out.println(getDurationString(100500));
    }

    private static String getDurationString(long minutes, long seconds) {
        if(minutes < 0 || ( seconds < 0 || seconds >59 ) ) {
            return "Invalid value";
        }

        long hours = minutes / 60;
        long minutesRemaining = (int) minutes % 60;

        return formatNumber(hours) + "h " + formatNumber(minutesRemaining) + "m " + formatNumber(seconds) + "s";
    }

    private static String formatNumber(long number) {
        return (number < 10) ? "0" + number : number + "";
    }

    private static String getDurationString(long seconds) {
        if(seconds < 0) {
            return "Invalid Value";
        }

        long minutes = seconds / 60;
        int secondsRemaining = (int) seconds % 60;

        return getDurationString(minutes, secondsRemaining);
    }


}
