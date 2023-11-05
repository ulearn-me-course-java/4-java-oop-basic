package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    private void RecountTime(){
        minutes += seconds / 60;
        seconds = seconds % 60;
        hours +=  minutes / 60;
        minutes = minutes % 60;
    }

    private void CorrectNegativeTime(){
        if (seconds < 0){
            minutes--;
            seconds += 60;
        }
        if (minutes < 0){
            hours--;
            minutes += 60;
        }
    }

    public void add(TimeSpan time){
        hours += time.hours;
        minutes += time.minutes;
        seconds += time.seconds;
        RecountTime();
    }

    public void subtract(TimeSpan time){
        hours += time.hours;
        minutes += time.minutes;
        seconds += time.seconds;
        RecountTime();
        CorrectNegativeTime();
    }

    public void SetHours(int hours){
        this.hours = hours;
    }

    public void SetMinutes(int minutes){
        this.minutes = minutes;
        RecountTime();
    }

    public void SetSeconds(int seconds){
        this.seconds = seconds;
        RecountTime();
    }

    public int GetHours(){
        return  hours;
    }

    public int GetMinutes(){
        return minutes;
    }

    public int GetSeconds(){
        return seconds;
    }

    @Override
    public String toString() {
        return String.format("(%d:%d:%d)", hours, minutes, seconds);
    }
}
