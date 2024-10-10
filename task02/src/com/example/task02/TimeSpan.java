package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    TimeSpan(int seconds, int minutes, int hours){
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }
    public int getHours(){
        return hours;
    }
    public int getMinutes(){
        return  minutes;
    }
    public int getSeconds(){
        return seconds;
    }
    public void setHours(int hours){
        if (hours >= 0) {
            this.hours = hours;
        }
        else{
            this.hours = 0;
            this.minutes = 0;
            this.seconds = 0;
        }
    }
    public void setMinutes(int minutes){
        if (minutes >= 0 ) {
            this.minutes = minutes % 60;
            setHours(this.hours + minutes / 60);
        }
        else{
            this.minutes = 60 + minutes % 60;
            setHours(this.hours - 1 + minutes / 60);
        }
    }
    public void setSeconds(int seconds){
        if (seconds >= 0 ) {
            this.seconds = seconds % 60;
            setMinutes(this.minutes + seconds / 60);
        }
        else{
            this.seconds = 60 + seconds % 60;
            setMinutes(this.minutes - 1 + seconds / 60);
        }
    }

    void add(TimeSpan time){
        setHours(this.hours + time.hours);
        setMinutes(this.minutes + time.minutes);
        setSeconds(this.seconds + time.seconds);
    }

    void subtract(TimeSpan time){
        setHours(this.hours - time.hours);
        setMinutes(this.minutes - time.minutes);
        setSeconds(this.seconds - time.seconds);
    }

    public String toString(){
        return String.format("%d:%d:%d", hours, minutes, seconds);
    }
}
