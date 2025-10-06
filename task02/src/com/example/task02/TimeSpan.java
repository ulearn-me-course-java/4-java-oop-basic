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
        timeConvert();
    }

    public int getMinutes(){
        return minutes;
    }

    public void setMinutes(int minutes){
        this.minutes = minutes;
        timeConvert();
    }

    public int getSeconds(){
        return seconds;
    }

    public void setSeconds(int seconds){
        this.seconds = seconds;
        timeConvert();
    }

    public TimeSpan(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;

        timeConvert();
    }

    public void timeConvert(){
        while (seconds >= 60) {
            minutes += 1;
            seconds -= 60;
        }

        while (minutes >= 60){
            hours += 1;
            minutes -= 60;
        }
    }

    void add(TimeSpan time){
        hours += time.hours;
        minutes += time.minutes;
        seconds += time.seconds;

        timeConvert();
    }

    void subtract(TimeSpan time){
        hours -= time.hours;
        minutes -= time.minutes;
        seconds -= time.seconds;

        timeConvert();
    }

    public String toString(){
        return String.format("%d:%d:%d", hours, minutes, seconds);
    }
}
