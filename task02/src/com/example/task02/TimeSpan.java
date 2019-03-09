package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(byte minutes) {
        this.minutes = minutes;
    }

    public void setSeconds(byte second) {
        this.seconds = second;
    }

    void add(TimeSpan time) {
        this.hours += time.hours;
        this.minutes += time.minutes;
        this.seconds += time.seconds;
    }

    void subtract(TimeSpan time) {
        long timeDiffInSecond = (hours * 3600 + minutes * 60 + seconds) -
                (time.hours * 3600 + time.minutes * 60 + time.seconds);
        if (timeDiffInSecond < 0) {
            timeDiffInSecond = 0;
        }
        this.hours = (int) timeDiffInSecond / 3600;
        this.minutes = (int) (timeDiffInSecond % 3600) / 60;
        this.seconds = (int) (timeDiffInSecond % 3600) % 60;
    }

    public String toString(){
        return hours + ":" + minutes + ":" + seconds;
    }
}
