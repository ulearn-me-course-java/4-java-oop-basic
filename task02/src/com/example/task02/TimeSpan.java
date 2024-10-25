package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public void setHours(int hours) {
        this.hours = hours;
    }
    public int getHours() {
        return hours;
    }
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
    public int getMinutes() {
        return minutes;
    }
    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
    public int getSeconds() {
        return seconds;
    }

    public TimeSpan(int hours, int minutes, int seconds)
    {
        setHours(hours + minutes / 60 + seconds / 3600);
        setMinutes(minutes % 60);
        setSeconds(seconds % 3600);
    }

    void add(TimeSpan time){
        this.seconds += time.getSeconds() % 3600;
        this.minutes += time.getMinutes() % 60;
        this.hours += time.getHours() + time.getMinutes() / 60 + time.getSeconds() / 3600;
    }

    void subtract(TimeSpan time){
        this.seconds -= time.getSeconds() % 3600;
        this.minutes -= time.getMinutes() % 60;
        this.hours -= time.getHours() + time.getMinutes() / 60 + time.getSeconds() / 3600;
    }

    public String toString(){
        return String.format("%d часов %d минут %d секунд", getHours(), getMinutes(), getSeconds());
    }
}
