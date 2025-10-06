package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

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
        correct();
    }
    public void setMinutes(int minutes){
        this.minutes = minutes;
        correct();
    }
    public void setSeconds(int seconds){
        this.seconds = seconds;
        correct();
    }

    public TimeSpan(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        correct();
    }

    public void add(TimeSpan time){
        this.hours += time.hours;
        this.minutes += time.minutes;
        this.seconds += time.seconds;
        correct();
    }

    public void subtract(TimeSpan time){
        this.hours -= time.hours;
        this.minutes -= time.minutes;
        this.seconds -= time.seconds;
        correct();
    }

    public String toString(){
        return String.format("%dч %dм %dс", hours, minutes, seconds);
    }

    private void correct(){
        int totalTime = hours* 3600 + minutes * 60 + seconds;
        hours = totalTime / 3600;
        minutes = (totalTime % 3600) / 60;
        seconds = (totalTime % 3600) % 60;
    }
}
