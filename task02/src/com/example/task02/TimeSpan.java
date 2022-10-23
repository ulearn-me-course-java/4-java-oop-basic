package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;
    public void setHours(int hours){
        this.hours = hours;
    }
    public int getHours(){
        return hours;
    }
    public void setMinutes(int minutes){
        this.minutes = minutes;
    }
    public int getMinutes(){
        return minutes;
    }
    public void setSeconds(int seconds){
        this.seconds = seconds;
    }
    public int getSeconds(){
        return seconds;
    }
    public TimeSpan(int hours, int minutes, int seconds){
        this.seconds = seconds%60;
        this.minutes = (minutes + seconds/60)%60;
        this.hours = hours + (minutes + seconds/60)/60;
    }
    void add(TimeSpan time){
        int hours = this.hours + time.getHours();
        int minutes = this.minutes + time.getMinutes();
        int seconds = this.seconds + time.getSeconds();
        this.seconds = seconds%60;
        this.minutes = (minutes + seconds/60)%60;
        this.hours = hours + (minutes + seconds/60)/60;

    }
    void subtract(TimeSpan time){
        int hours = this.hours - time.getHours();
        int minutes = this.minutes - time.getMinutes();
        int seconds = this.seconds - time.getSeconds();

        if (seconds < 0) {
            seconds = 60 - seconds;
            minutes--;
        }
        if (minutes < 0) {
            minutes = 60 - minutes;
            hours--;
        }

        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    public String toString(){
        return ("Hours: " + this.hours + " Minutes: " + this.minutes + " Seconds: " + this.seconds);
    }
}
