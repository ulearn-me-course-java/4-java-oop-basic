package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public int getHours(){
        return hours;
    }

    public void setHours(int hours){
        this.hours = hours;
    }

    public int getMinutes(){
        return minutes;
    }

    public void setMinutes(int minutes){
        this.minutes = minutes;
    }
    public int getSeconds(){
        return seconds;
    }

    public void setSeconds(int seconds){
        this.seconds = seconds;
    }

    TimeSpan(int hours, int minutes, int seconds){
        while(minutes > 60) {
            hours++;
            minutes=-60;
        }
        while(seconds > 60) {
            minutes++;
            seconds=-60;
        }
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    void add(TimeSpan time) {
        hours+=time.hours;
        minutes+=time.minutes;
        seconds+=time.seconds;
    }

    void subtract(TimeSpan time) {
        hours-=time.hours;
        minutes=-time.minutes;
        seconds-=time.seconds;
    }

    @Override
    public String toString(){
        return String.format("(%d hours, %d minutes, %d seconds)", hours, minutes, seconds);
    }


}
