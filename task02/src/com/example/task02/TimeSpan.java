package com.example.task02;

public class TimeSpan {
    public  TimeSpan(int seconds, int minutes, int hours){
        addTime(seconds, minutes, hours);
    }
    private int seconds, minutes, hours;

    private void addTime(int sec, int min, int h){
        int timeInSeconds = seconds + minutes * 60 + hours * 60 * 60;
        int timeInSecondsToAdd = sec + min * 60 + h * 60 * 60;

        timeInSeconds += timeInSecondsToAdd;
        /**
         * if time lesser than 0 exit and don't change fields
         */
        if (timeInSeconds < 0)
            return;

        hours = timeInSeconds / (60 * 60);
        timeInSeconds %= 60 * 60;

        minutes = timeInSeconds / 60;
        timeInSeconds %= 60;

        seconds = timeInSeconds;
    }

    public void add(TimeSpan time){
        addTime(time.seconds, time.minutes, time.hours);
    }
    public void subtract(TimeSpan time){
        addTime(-time.seconds, -time.minutes, -time.hours);
    }
    @Override
    public String toString() {
        return String.format("seconds %d, minutes %d, hours %d", seconds, minutes, hours);
    }
}
