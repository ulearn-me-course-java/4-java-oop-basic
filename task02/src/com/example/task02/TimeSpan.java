package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(int hours, int minutes, int seconds){
        if (seconds >= 60){
            this.seconds = seconds % 60;
            minutes += seconds/60;
        }
        else {
            this.seconds = seconds;
        }
        if (minutes >= 60){
            this.minutes = minutes % 60;
            hours += minutes/60;
        }
        else {
            this.minutes = minutes;
        }
        this.hours = hours;

    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
    void add(TimeSpan time){
        this.hours += time.hours;
        this.minutes += time.minutes;
        this.seconds += time.seconds;
    }
    void subtract(TimeSpan time){
        this.hours -= time.hours;
        this.minutes -= time.minutes;
        this.seconds -= time.seconds;
    }
    public String toString(){
        return  String.format("%s:%s:%s",this.hours, this.minutes, this.seconds);
    }
}
