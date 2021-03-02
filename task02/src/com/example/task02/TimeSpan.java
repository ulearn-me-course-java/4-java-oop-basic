package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(int h, int m, int s)
    {
        hours = h;
        minutes = m;
        seconds = s;
    }
    public int getHours(){
        return hours;
    }

    public int getMinutes(){
        return minutes;
    }

    public int getSeconds(){
        return seconds;
    }


    public void setHours( int h){
        hours = h;
    }

    public void setMinutes(int m){
        minutes += m % 60;
        hours += m/60;
    }

    public void setSecond(int s){
        seconds += s % 60;
        minutes += s / 60;
        hours += minutes += s / (60*60);
    }

    void add(TimeSpan time){
        seconds = (seconds + time.seconds) % 60;
        minutes = (((seconds + time.seconds) / 60) + time.minutes) % 60;
        hours =  ((((seconds + time.seconds) / 60) + time.minutes) / 60) + time.hours;
    }

    void subtract(TimeSpan time){
        seconds -= time.seconds;
        minutes -= time.minutes;
        hours -=time.hours;
    }
    public String toString(){
        return hours+":"+minutes+":"+seconds;
    }
}
