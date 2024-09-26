package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(int hour, int min, int sec){
        hours=hour;
        minutes=min;
        seconds=sec;
    }
    public int getHours(){
        return hours;
    }

    public void setHours(int value){
        if(value>=0)
            hours=value;
        else
            throw new IllegalArgumentException("Значение не может быть отрицательным");
    }

    public int getMinutes(){
        return minutes;
    }

    public void setMinutes(int value){
        if(value>=0)
            minutes=value;
        else
            throw new IllegalArgumentException("Значение не может быть отрицательным");
    }

    public int getSeconds(){
        return seconds;
    }

    public void setSeconds(int value){
        if(value>=0)
            seconds=value;
        else
            throw new IllegalArgumentException("Значение не может быть отрицательным");
    }

    void add(TimeSpan time){
        int sec=time.seconds+seconds;
        int min=time.minutes+minutes+sec/60;
        int hour=time.hours+hours+min/60;
        seconds=sec%60;
        minutes=min%60;
        hours=hour;
    }

    void subtract(TimeSpan time){

        int t1=seconds+minutes*60+hours*3600;
        int t2=time.seconds+time.minutes*60+time.hours*3600;
        t1-=t2;
        hours=t1/3600;
        minutes=t1%3600/60;
        seconds=t1%3600-minutes*60;
    }

    public String toString(){
        int h,m,s;
        char sign;
        if(seconds<0){
            m=-minutes;
            s=-seconds;
            h=-hours;
            sign='-';
        }
        else {
            m=minutes;
            s=seconds;
            h=hours;
            sign=' ';
        }
        return String.format("%s%s:%s:%s",sign,h,m,s);
    }
}
