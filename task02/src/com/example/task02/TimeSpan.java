package com.example.task02;

public class TimeSpan {
    private int hour;
    private int minute;
    private int second;

    public TimeSpan(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void add(TimeSpan time) {
        if ((this.second + time.second) >= 60){
            this.minute++;
            this.second = this.second + time.second - 60;
        }
        else {
            this.second += time.second;
        }

        this.hour += time.hour;
        if ((this.minute + time.minute) >= 60){
            this.hour++;
            this.minute = this.minute + time.minute - 60;
        }
        else {
            this.minute += time.minute;
        }

    }

    public void subtract (TimeSpan time) {
        this.hour -= time.hour;
        if ((this.minute - time.minute) < 0){
            this.hour--;
            this.minute = this.minute - time.minute + 60;
        }
        else {
            this.minute -= time.minute;
        }

        if ((this.second - time.second) < 60){
            if (minute > 0) {
                this.minute--;
            }
            this.second = this.second - time.second + 60;
        }
        else {
            this.second -= time.second;
        }
    }
    @Override
    public String toString() {
        return this.hour + ":" + this.minute + ":" + this.second;
    }
}