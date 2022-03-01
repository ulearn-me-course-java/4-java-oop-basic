package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;
    
    public TimeSpan(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }
    
    public int getHours() {
        return hours;
    }
    
    public int getMinutes() {
        return minutes;
    }
    
    public int getSeconds() {
        return seconds;
    }
    
    public void setHours(int hours) {
        this.hours = hours;
    }
    
    public void setMinutes(int minutes) {
        int hours = minutes / 60;
        this.hours += hours;
        this.minutes = minutes % 60;
    }
    
    public void setSeconds(int seconds) {
        int minutes = seconds / 60;
        setMinutes(this.minutes + minutes);
        this.seconds = seconds % 60;
    }
    
    public void add(TimeSpan timeSpan) {
        hours += timeSpan.getHours();
        minutes += timeSpan.getMinutes();
        seconds += timeSpan.getSeconds();
        calculate();
    }
    
    public void subtract(TimeSpan timeSpan) {
        hours -= timeSpan.getHours();
        minutes -= timeSpan.getMinutes();
        seconds -= timeSpan.getSeconds();
        calculate();
    }
    
    private void calculate() {
        while (minutes < 0 && hours > 0) {
            hours--;
            minutes += 60;
        }
        setMinutes(minutes);
        while (seconds < 0 && minutes > 0) {
            minutes--;
            seconds += 60;
        }
        setSeconds(seconds);
    }
    
    @Override
    public String toString() {
        return String.format("%d:%d:%d", hours, minutes, seconds);
    }
}
