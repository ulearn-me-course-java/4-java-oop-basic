package com.example.task02;

public class TimeSpan {
    private int hour;
    private int minute;
    private int second;

    public TimeSpan(int h, int m, int s){
        hour = h;
        minute = m;
        second = s;
    }

    public TimeSpan(){}

    public void setHour(int h){
        hour = h;
    }

    public int getHour(){
        return hour;
    }

    public void setMinute(int m){
        if(m > 60) {
            hour = m / 60;
            minute = m % 60;
        }
        else {
            minute = m;
        }
    }

    public int getMinute(){
        return minute;
    }

    public void setSecond(int s){
        if(s > 60) {
            int middleHour = s / 3600;
            hour = middleHour;
            if(middleHour > 0)
                s -= 3600 * middleHour;
            minute = s / 60;
            second = s % 60;
        }
        else {
            second = s;
        }
    }

    public int getSecond(){
        return second;
    }

    void add(TimeSpan time){
        int allSeconds1 = hour * 3600 + minute * 60 + second;
        int allSeconds2 = time.hour * 3600 + time.minute * 60 + time.second;
        int adding = allSeconds1 + allSeconds2;
        this.setSecond(adding);
    }

    void subtract(TimeSpan time){
        int allSeconds1 = hour * 3600 + minute * 60 + second;
        int allSeconds2 = time.hour * 3600 + time.minute * 60 + time.second;
        int sub = allSeconds1 - allSeconds2;
        this.setSecond(sub);
    }

    public String toString(){
        return hour + ":" + minute + ":" + second;
    }
}
