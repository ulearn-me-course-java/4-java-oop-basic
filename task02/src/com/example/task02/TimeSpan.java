package com.example.task02;

public class TimeSpan {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    public void add(TimeSpan time){
        this.second += time.second;
        this.minute += time.minute;
        this.hour += time.hour;
        checkTime();
    }

    public void subtract(TimeSpan time){
        if (this.second < time.second){
            this.minute--;
            this.second += 60;
        }
        this.second -= time.second;

        if (this.minute < time.minute){
            this.hour--;
            this.minute += 60;
        }
        this.minute -= time.minute;
        if (this.hour < time.hour)
            this.hour = 0;
        else
            this.hour -= time.hour;
    }

    public String toString(){
        return String.format("(%d : %d : %d)", hour, minute, second);
    }

    private void checkTime(){
        while (this.second > 59){
            this.second -= 60;
            this.minute++;
        }
        while (this.minute > 59){
            this.minute -= 60;
            this.hour++;
        }
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
        checkTime();
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
        checkTime();
    }

    public TimeSpan() { }
    public TimeSpan(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        checkTime();
    }
}
