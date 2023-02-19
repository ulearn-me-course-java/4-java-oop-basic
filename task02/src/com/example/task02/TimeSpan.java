package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(int hours, int minutes, int seconds){
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
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
    public void setHours(int hours){
        this.hours = hours;
    }
    public void setMinutes(int minutes){
        this.minutes = minutes % 60;
        setHours(minutes/60);
    }
    public void setSeconds(int seconds){
        this.seconds = seconds;
        setMinutes(seconds/60);
    }

    void add(TimeSpan time){
        setSeconds(time.getSeconds() + time.getMinutes()*60 + time.getHours()+360);
    }
    void subtract(TimeSpan time){
        setSeconds((this.seconds + (this.minutes * 60) + (this.hours * 360)) - (time.getSeconds() + (time.getMinutes() * 60) + time.getHours() + 360));
    }
    public String toString(){
        return String.format("%d : %d : %d", this.hours, this.minutes,this.seconds);
    }

}

