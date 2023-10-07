package com.example.task02;

public class TimeSpan {

    private int hours;

    public int getHours (){
        return hours;
    }

    public void setHours (int hours) {
        this.hours = hours;
    }
    private int minutes;
    public int getMinutes (){
        return minutes;
    }
    public void setMinutes (int minutes) {
        this.hours = minutes / 60;
        this.minutes = minutes % 60;
    }
    private int seconds;
    public int getSeconds (){
        return seconds;
    }
    public void setSeconds (int seconds) {
        this.hours = seconds / 3600;
        seconds %= 3600;
        this.minutes = seconds / 60;
        this.seconds = seconds % 60;
    }

    public void add (TimeSpan timeSpan){
        int allInSeconds = (getHours() + timeSpan.getHours())*3600 +
                (getMinutes() + timeSpan.getMinutes())*60 +
                    getSeconds() + timeSpan.getSeconds();
        setSeconds(allInSeconds);
    }
    public void subtract (TimeSpan timeSpan){
        int allInSeconds = (getHours() - timeSpan.getHours())*3600 +
                (getMinutes() - timeSpan.getMinutes())*60 +
                getSeconds() - timeSpan.getSeconds();
        setSeconds(allInSeconds);
    }

    public String toString() {
        return String.format("%s:%s:%s", hours, minutes, seconds);
    }

    public TimeSpan (int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

}
