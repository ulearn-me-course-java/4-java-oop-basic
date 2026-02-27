package com.example.task02;

public class TimeSpan {
    private int hours = 0;
    private int minutes = 0;
    private int seconds = 0;

    public int getHours() { return hours; }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() { return minutes; }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() { return seconds; }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public TimeSpan(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    private void setNormalizedTime(int hours, int minutes, int seconds) {
        if (hours < 0 || minutes < 0 || seconds < 0)
            throw new IllegalArgumentException("Время не может быть отрицательным!");

        int totalSeconds = hours * 3600 + minutes * 60 + seconds;

        this.hours = totalSeconds / 3600;
        this.minutes = (totalSeconds % 3600) / 60;
        this.seconds = totalSeconds % 60;
    }
    public void add(TimeSpan time) {
        setNormalizedTime(hours + time.hours, minutes + time.minutes, seconds + time.seconds);
    }

    public void subtract(TimeSpan time) {
        if ((time.hours * 3600 + time.minutes * 60 + time.seconds) > (hours * 3600 + minutes * 60 + seconds))
            throw new IllegalArgumentException("Время не может быть отрицательным!");

        setNormalizedTime(hours - time.hours, minutes - time.minutes, seconds - time.seconds);
    }

    public String toString() {
        setNormalizedTime(hours, minutes, seconds);
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}
