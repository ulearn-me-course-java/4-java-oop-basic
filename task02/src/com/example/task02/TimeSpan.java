package com.example.task02;

import java.sql.Time;

public class TimeSpan {
    private int hour;
    private int min;
    private int sec;

    public TimeSpan(int hour, int min, int sec){
        setHour(hour);
        this.min = min;
        this.sec = sec;
    }
    public int getHour(){
        return hour;
    }
    public void setHour(int hour){
        this.hour = hour;
    }
    public int getMin(){
        return min;
    }
    public void setMin(int min){
        if (min/60 != 0){
            this.hour += min/60;
        }
        this.min = min%60;
    }
    public int getSec(){
        return sec;
    }
    public void setSec(int sec){
        if(sec/3600 != 0){
            this.hour += sec/3600;
            sec %= 3600;
        }
        if(sec/60 != 0){
            this.min += sec/60;
        }
        this.sec = sec%60;
    }
    void add(TimeSpan time){
        int sum = hour*3600 + min*60 + sec + time.hour*3600 + time.min*60 + time.sec;
        setSec(sum);
    }
    void subtract(TimeSpan time){
        int sub = hour*3600 + min*60 + sec - time.hour*3600 - time.min*60 - time.sec;
        setSec(sub);
    }
    public String toString(){
         return String.format("%d час %d минут %d секунд", hour, min, sec);
    }
}
