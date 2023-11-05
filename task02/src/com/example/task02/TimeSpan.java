package com.example.task02;

public class TimeSpan {
    private int seconds;
    private int minutes;
    private int hours;

    public int getSeconds() {
        return seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getHours() {
        return hours;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public TimeSpan(int seconds, int minutes, int hours){
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }
    void add(TimeSpan time){
        time.seconds += seconds;
        time.minutes += minutes;
        time.hours += hours;
    }
    void subtract(TimeSpan time){
        time.seconds -= seconds;
        time.minutes -= minutes;
        time.hours -= hours;
    }
    public String toString(){
        return (hours+ ":" + minutes + ":" + seconds);
    }
}
