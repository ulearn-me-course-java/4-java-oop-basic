package com.example.task02;

public class TimeSpan {
    private int hour;
    private int minutes;
    private int seconds;

    public TimeSpan() {
        this.hour = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    public TimeSpan(int hour, int minutes, int seconds) {
        int seconds_temp = this.seconds + this.minutes*60 + this.hour*3600;

        this.hour = seconds_temp/3600;
        seconds %= 3600;
        this.minutes = seconds_temp/60;
        seconds %= 60;
        this.seconds = seconds_temp;
    }

    public String toString() {
        return this.hour + ":" + this.minutes + ":" + this.seconds;
    }

    public void add(TimeSpan time) {
        int seconds_temp = this.seconds + this.minutes*60 + this.hour*3600 + time.seconds + time.minutes*60 + time.hour*3600;

        this.hour = seconds_temp/3600;
        seconds %= 3600;
        this.minutes = seconds_temp/60;
        seconds %= 60;
        this.seconds = seconds_temp;
    }

    public void subtract(TimeSpan time) {
        int seconds_temp = this.seconds + this.minutes*60 + this.hour*3600 - time.seconds - time.minutes*60 - time.hour*3600;

        this.hour = seconds_temp/3600;
        seconds %= 3600;
        this.minutes = seconds_temp/60;
        seconds %= 60;
        this.seconds = seconds_temp;
    }
}
