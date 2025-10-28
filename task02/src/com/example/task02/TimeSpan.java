package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        timeFormat();
    }

    private void timeFormat() {
        if (seconds >= 60) {
            minutes += seconds / 60;
            seconds %= 60;
        }

        if (minutes >= 60) {
            hours += minutes / 60;
            minutes %= 60;
        }
    }

    public int getHours() {
        return hours;
    }
    public void setHours(int hours) {
        this.hours = hours;
        timeFormat();
    }

    public int getMinutes() {
        return minutes;
    }
    public void setMinutes(int minutes) {
        this.minutes = minutes;
        timeFormat();
    }

    public int getSeconds() {
        return seconds;
    }
    public void setSeconds(int seconds) {
        this.seconds = seconds;
        timeFormat();
    }

    public void add(TimeSpan time) {
        seconds += time.seconds;
        minutes += time.minutes;
        hours += time.hours;
        timeFormat();
    }

    public void subtract(TimeSpan time) {
        int prog_data = hours * 3600 + minutes * 60 + seconds;
        int user_data = time.hours * 3600 + time.minutes * 60 + time.seconds;
        int new_time = Math.abs(user_data - prog_data);

        hours = new_time / 3600;
        minutes = (new_time % 3600) / 60;
        seconds = new_time % 60;
    }

    public String toString() {
        return String.format("%d hours, %d minutes, %d seconds", hours, minutes, seconds);
    }
}
