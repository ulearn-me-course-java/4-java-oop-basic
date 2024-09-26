package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(int hours, int minutes, int seconds){
        this.setTime(hours, minutes, seconds);
    }

    public void setTime(int hours, int minutes, int seconds){
        if (seconds < 0 || minutes < 0 || hours < 0){
            System.out.println("Time is not corect!");
        }

        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;

        normalTime();
    }

    private void normalTime(){
        if (seconds >= 60){
            minutes += seconds / 60;
            seconds %= 60;
        }
        if (minutes >= 60){
            hours += minutes / 60;
            minutes %= 60;
        }
    }
    public int getHours(){
        return hours;
    }
    public int getMinutes(){
        return minutes;
    }
    public int getSeconds(){
        return seconds;
    }

    public void add(TimeSpan time){
        this.hours = this.hours + time.getHours();
        this.minutes = this.minutes + time.getMinutes();
        this.seconds = this.seconds + time.getSeconds();

        normalTime();
    }
    public void subtract(TimeSpan time){
        this.hours = this.hours - time.getHours();
        this.minutes = this.minutes - time.getMinutes();
        this.seconds = this.seconds - time.getSeconds();

        normalTime();
    }

    public String toString(){
        return hours + ":" + minutes + ":" + seconds;
    }
}
