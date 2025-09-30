package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(int hours, int minutes, int seconds) {
        setTime(hours, minutes, seconds);
    }

    private void setTime(int hours, int minutes, int seconds) {
        long totalSeconds = hours * 3600L + minutes * 60L + seconds;

        if (totalSeconds < 0) {
            totalSeconds = 0;
        }

        this.hours = (int) (totalSeconds / 3600);
        totalSeconds %= 3600;
        this.minutes = (int) (totalSeconds / 60);
        this.seconds = (int) (totalSeconds % 60);
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        setTime(hours, this.minutes, this.seconds);
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        setTime(this.hours, minutes, this.seconds);
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        setTime(this.hours, this.minutes, seconds);
    }

    public void add(TimeSpan time) {
        setTime(
                this.hours + time.hours,
                this.minutes + time.minutes,
                this.seconds + time.seconds
        );
    }

    public void subtract(TimeSpan time) {
        long thisTotal = this.hours * 3600L + this.minutes * 60L + this.seconds;
        long otherTotal = time.hours * 3600L + time.minutes * 60L + time.seconds;
        long resultTotal = thisTotal - otherTotal;

        setTime(0, 0, (int)resultTotal);
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}