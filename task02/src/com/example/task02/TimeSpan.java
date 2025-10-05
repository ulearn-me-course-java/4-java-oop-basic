package com.example.task02;

public class TimeSpan {
    private int hour;
    public void setHour(int hour){
        this.hour = hour;
    }
    public int getHour(){
        return hour;
    }

    private int minute;
    public void setMinute(int minute){
        this.minute = minute % 60;
        hour += minute / 60;
    }
    public int getMinute(){
        return minute;
    }

    private int second;
    public void setSecond(int second){
        this.second = second % 60;
        minute += (second / 60) % 60;
        hour += second / 3600;
    }
    public int getSecond(){
        return second;
    }

    private void timeToSecond(){
        second += hour * 3600 + minute * 60;
        minute = 0;
        hour = 0;
    }
    private void secondToTime(){
        second %= 60;
        minute += (second / 60) % 60;
        hour += second / 3600;
    }
    void add(TimeSpan time){
        /*
        second += time.second;
        minute += time.minute + second / 60;
        hour += time.hour + minute / 60;
        second %= 60;
        minute %=60;
        */
        setHour(time.hour);
        setMinute(time.minute);
        setSecond(time.second);
    }
    void subtract(TimeSpan time){
        timeToSecond();
        time.timeToSecond();
        second -= time.second;
        secondToTime();
    }

    public TimeSpan(int hour, int minute, int second) {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }
    public String toString(){
        String timeToString = String.format("(%d, %d, %d)", hour, minute, second);
        return timeToString;
    }
}
