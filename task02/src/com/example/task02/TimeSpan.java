package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(int hours, int minutes, int seconds){
        this.seconds = seconds % 60;
        this.minutes = (minutes + seconds / 60) % 60;
        this.hours = hours + minutes / 60;
        normalize();
    }

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

    public void add(TimeSpan time){
        this.seconds += time.getSeconds();
        this.minutes += time.getMinutes();
        this.hours += time.getHours();
        normalize();
    }

    public void subtract(TimeSpan time){
        this.seconds -= time.getSeconds();
        this.minutes -= time.getMinutes();
        this.hours -= time.getHours();
        normalize();
    }

    public void normalize(){
        if (seconds < 0){
            minutes--;
            seconds += 60;
        }

        minutes += seconds / 60;
        seconds = seconds % 60;

        if (minutes < 0){
            hours--;
            minutes += 60;
        }

        hours += minutes/60;
        minutes = minutes % 60;

        if (hours < 0){
            hours = 0;
        }
    }

    public String toString(){
        return String.format("%d hours, %d minutes, %d seconds", hours, minutes, seconds);
    }
}
