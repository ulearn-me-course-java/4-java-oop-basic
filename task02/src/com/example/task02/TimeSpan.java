package com.example.task02;

public class TimeSpan {
    private int hours;
    private int seconds;
    private int minutes;
    public int GetHours(){
        return hours;
    }
    public void SetHours(int hours){
        this.hours = hours;
    }
    public int GetSeconds(){
        return seconds;
    }
    public void SetSeconds(int seconds){
        this.seconds = seconds;
    }
    public int GetMinutes(){
        return minutes;
    }
    public void SetMinutes(int minutes){
        this.minutes = minutes;
    }

    public TimeSpan(int hour, int minute, int second) {
        this.hours = hour;
        this.minutes = minute;
        this.seconds = second;
        correctTime();
    }

    public void add(TimeSpan time){
        this.hours += time.GetHours();
        this.minutes += time.GetMinutes();
        this.seconds += time.GetSeconds();
        correctTime();
    }

    public void subtract(TimeSpan time){
        this.hours -= time.GetHours();
        this.minutes -= time.GetMinutes();
        this.seconds -= time.GetSeconds();
        correctTime();
    }

    private void correctTime(){
        if(this.seconds > 60){
            this.minutes += this.seconds / 60;
            this.seconds %= 60;
        }
        if (this.minutes > 60){
            this.hours += this.minutes / 60;
            this.minutes %= 60;
        }
        if (this.minutes < 0){
            this.hours -= (minutes / 60) + 1;
            this.minutes = 60 + this.minutes;
        }
    }

    public String toString(){
        return String.format("hours: " + this.hours + " minutes: " + this.minutes + " seconds: " + this.seconds);
    }
}
