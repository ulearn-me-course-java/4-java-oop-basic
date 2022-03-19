package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(){
        this(0, 0, 0);
    }
    public TimeSpan(int hours, int minutes, int seconds){
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }
    public int getSeconds(){
        return seconds;
    }
    public void setSeconds(int seconds){
        if(seconds > 60) {
            setMinutes(seconds / 60);
        }
        else if(seconds < 0){
            setMinutes(this.minutes + seconds / 60);
            this.seconds = 60 + seconds;
        }
        this.seconds = seconds % 60;
    }
    public int getMinutes(){
        return minutes;
    }
    public void setMinutes(int minutes){
        if(minutes > 60){
            setHours(minutes / 60);
        }
        else if(minutes < 0){
            setHours(this.hours + minutes / 60);
            this.minutes = 60 + minutes;
        }
        this.minutes = minutes % 60;
    }
    public int getHours(){
        return hours;
    }
    public void setHours(int hours){
        this.hours = hours;
    }

    public void add(TimeSpan time){
        setSeconds(this.seconds + time.getSeconds());
        setMinutes(this.minutes + time.getMinutes());
        setHours(this.hours + time.getHours());
    }
    public void subtract(TimeSpan time){
        setSeconds(this.seconds - time.getSeconds());
        setMinutes(this.minutes - time.getMinutes());
        setHours(this.hours - time.getHours());
    }
    public String toString(){
        return "Интервал: " + hours + ":" + minutes + ":" + seconds;
    }
}
