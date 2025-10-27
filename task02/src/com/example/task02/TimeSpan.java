package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;

        timeConvert();
    }

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

    public void timeConvert(){
        if (seconds >= 60) {
            minutes += seconds / 60;
            seconds %= 60;
        }

        if (minutes >= 60) {
            hours += minutes / 60;
            minutes %= 60;
        }
    }

    void add(TimeSpan time){
        hours += time.hours;
        minutes += time.minutes;
        seconds += time.seconds;

        timeConvert();
    }

    void subtract(TimeSpan time) {
        int totalSecondsThis = hours * 3600 + minutes * 60 + seconds;
        int totalSecondsOther = time.hours * 3600 + time.minutes * 60 + time.seconds;

        int sub = Math.abs(totalSecondsThis - totalSecondsOther);

        hours = sub / 3600;
        minutes = (sub % 3600) / 60;
        seconds = sub % 60;
    }

    public String toString(){
        return String.format("%d:%d:%d", hours, minutes, seconds);
    }
}

