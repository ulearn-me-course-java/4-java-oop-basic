package com.example.task02;

public class TimeSpan{
    private int hour;
    private int minute;
    private int second;

    public TimeSpan(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;

        normalizeData();
    }

    public int getHour(){
        return hour;
    }

    public void setHour(int hour){
        this.hour = hour;
    }

    public int getMinute(){
        return minute;
    }

    public void setMinute(int minute){
        this.minute = minute;
    }

    public int getSecond(){
        return second;
    }

    public void setSecond(int second){
        this.second = second;
    }
    private void normalizeData(){
        if(this.second > 60){
            this.minute += this.second / 60;
            this.second %= 60;
        }
        if (this.minute > 60){
            this.hour += this.minute / 60;
            this.minute %= 60;
        }
        if (this.minute < 0){
            this.hour -= (minute / 60) + 1;
            this.minute = 60 + this.minute;
        }
    }

    public void add(TimeSpan time){
        this.hour += time.getHour();
        this.minute += time.getMinute();
        this.second += time.getSecond();

        normalizeData();
    }

    public void subtract(TimeSpan time){
        this.hour -= time.getHour();
        this.minute -= time.getMinute();
        this.second -= time.getSecond();

        normalizeData();
    }

    public String toString() {
        return String.format("%s hours, %s minutes, %s seconds", this.hour, this.minute, this.second);
    }
}