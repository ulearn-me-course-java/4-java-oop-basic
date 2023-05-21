package com.example.task02;

public class TimeSpan {

    private int hours;
    private int minutes;
    private int seconds;
    private int timeInSeconds;
    public TimeSpan(int hours, int minutes, int seconds){
        int temp = hours * 3600 + minutes * 60 + seconds;
        timeInSeconds = temp;
        convertTime();
    }

    private void convertTime(){
        hours = timeInSeconds / 3600;
        minutes = (timeInSeconds - 3600 * hours) / 60;
        seconds = timeInSeconds - 3600 * hours - 60 * minutes;
    }

    public void add(TimeSpan timeSpan){
        timeInSeconds += timeSpan.getHours() * 3600 + timeSpan.getMinutes() * 60 + timeSpan.getSeconds();
        convertTime();
    }

    public void subtract(TimeSpan timeSpan){
        timeInSeconds -= (timeSpan.getHours() * 3600 + timeSpan.getMinutes() * 60 + timeSpan.getSeconds());
        convertTime();
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes){
        this.minutes = minutes;
    }

    public int getMinutes(){
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public String toString() {
        return String.format("(%d:%d:%d)", hours, minutes, seconds);
    }
}
