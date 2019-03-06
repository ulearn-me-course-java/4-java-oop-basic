package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    TimeSpan(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    void add(TimeSpan timeSpan){
        int currentTime = timeInSeconds(hours, minutes, seconds);
        int otherTime = timeInSeconds(timeSpan.hours, timeSpan.minutes, timeSpan.seconds);
        int tempTime = currentTime + otherTime;

        if (!inInterval(tempTime, 0, 86399)){
            System.out.println("Введено некоректное время");
            return;
        }

        TimeSpan tempTimeSpan = secondsInTime(tempTime);
        hours = tempTimeSpan.hours;
        minutes = tempTimeSpan.minutes;
        seconds = tempTimeSpan.seconds;
    }

    void subtract(TimeSpan timeSpan) {
        int currentTime = timeInSeconds(hours, minutes, seconds);
        int otherTime = timeInSeconds(timeSpan.hours, timeSpan.minutes, timeSpan.seconds);
        int tempTime = currentTime - otherTime;

        if (!inInterval(tempTime, 0, 86399)){
            System.out.println("Введено некоректное время");
            return;
        }

        TimeSpan tempTimeSpan = secondsInTime(tempTime);
        hours = tempTimeSpan.hours;
        minutes = tempTimeSpan.minutes;
        seconds = tempTimeSpan.seconds;
    }

    public String toString(){
        return hours + ":" + minutes + ":" + seconds;
    }

    private int timeInSeconds(int hours, int minutes, int seconds){
        return hours * 3600 + minutes * 60 + seconds;
    }

    private TimeSpan secondsInTime(int seconds){
        return new TimeSpan(seconds / 3600, (seconds % 3600) / 60, seconds % 60);
    }

    private boolean inInterval(int value, int leftBord, int rightBord){
        return value >= leftBord && value <= rightBord;
    }

    public int getHours(){ return hours; }
    public void setHours(int hours){
        if (!inInterval(hours, 0, 23)){
            System.out.println("Введено некоректное время");
            return;
        }
        this.hours = hours;
    }

    public int getMinutes(){ return minutes; }
    public void setMinutes(int minutes){
        if (!inInterval(hours, 0, 59)){
            System.out.println("Введено некоректное время");
            return;
        }
        this.minutes = minutes;
    }

    public int getSeconds(){ return seconds; }
    public void setSeconds(int seconds){
        if (!inInterval(hours, 0, 59)){
            System.out.println("Введено некоректное время");
            return;
        }
        this.seconds = seconds;
    }
}
