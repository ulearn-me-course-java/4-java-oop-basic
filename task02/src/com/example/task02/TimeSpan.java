package com.example.task02;

public class TimeSpan {
    private int seconds;
    public int getSeconds(){
        return this.seconds;
    }
    public void setSeconds(int seconds){
        this.seconds = seconds;
        FormatTime();
    }

    private int minutes;

    public int getMinutes(){
        return this.minutes;
    }
    public void setMinutes(int minutes){
        this.minutes = minutes;
        FormatTime();
    }
    private int hours;

    public int getHours(){
        return this.hours;
    }
    public void setHours(int hours){
        this.hours = hours;
    }

    public TimeSpan(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;

        FormatTime();

    }

    public void add(TimeSpan time){
        this.seconds += time.seconds;
        this.minutes += time.minutes;
        this.hours += time.hours;

        FormatTime();
    }
    public void subtract(TimeSpan time){
        this.seconds -= time.seconds;
        this.minutes -= time.minutes;
        this.hours -= time.hours;

        FormatTime();
    }

    public String toString(){
        return String.format("%d : %d : %d" , this.hours, this.minutes, this.seconds);
    }
    private void FormatTime(){
        int fullTime = this.hours * 3600 + this.minutes * 60 + this.seconds;
        this.hours = fullTime / 3600;
        this.minutes = (fullTime - this.hours * 3600) / 60;
        this.seconds = ((fullTime - this.hours * 3600) - this.minutes * 60);
    }
}
