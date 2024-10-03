package com.example.task02;

public class TimeSpan {
    private int seconds;
    private int minutes;
    private int hours;

    public TimeSpan(int seconds, int minutes, int hours){
        this.seconds = seconds % 60;
        this.minutes = (minutes + (seconds / 60)) % 60;
        this.hours = hours + (minutes / 60);
    }

    public void add(TimeSpan ts){
        this.seconds += ts.seconds;
        this.minutes += ts.minutes;
        this.hours += ts.hours;

        getRightTime();
    }

    public void subtract(TimeSpan ts){
        this.seconds -= ts.seconds;
        this.minutes -= ts.minutes;
        this.hours -= ts.hours;

        getRightTime();
    }

    public void getRightTime(){
        if(seconds < 0){
            minutes--;
            seconds += 60;
        }
        minutes += seconds / 60;
        seconds %= 60;

        if(minutes < 0){
            hours--;
            minutes += 60;
        }
        hours += minutes / 60;
        minutes %= 60;

        if(hours < 0){
            hours = 0;
        }
    }

    public int getSeconds(){
        return seconds;
    }

    public int getMinutes(){
        return minutes;
    }

    public int getHours(){
        return hours;
    }

    public void setSeconds(int seconds){
        this.seconds = seconds;
    }

    public void setMinutes(int minutes){
        this.minutes = minutes;
    }

    public void setHours(int hours){
        this.hours = hours;
    }

    public String toString(){
        return String.format("%dч %dм %dс", hours, minutes, seconds);
    }
}
