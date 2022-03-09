package com.example.task02;

public class TimeSpan {

    private int hour,min, sec, timeInSec;

    public TimeSpan(int hour, int min, int sec){
        editTime(hour,min,sec);
    }
    void add(TimeSpan time){
        editTime(time.hour,time.min,time.sec);
    }
    void subtract(TimeSpan time){
        editTime(-time.hour,-time.min,-time.sec);
    }
    public String toString(){
        return  String.format("seconds %d, minutes %d, hours %d", sec, min, hour);
    }

    void editTime(int hour,int min,int sec){
        timeInSec += hour * 360 + min * 60 + sec;

        hour = timeInSec / (60 * 60);
        timeInSec %= 60 * 60;
        min = timeInSec / 60;
        timeInSec %= 60;
        sec = timeInSec;
    }
}
