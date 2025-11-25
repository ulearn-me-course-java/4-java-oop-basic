package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public int getHours(){ return hours; }
    public void setHours(int hours){ this.hours = hours; }

    public int getMinutes(){ return minutes; }
    public void setMinutes(int minutes){ this.minutes = minutes; }

    public int getSeconds(){ return seconds; }
    public void setSeconds(int seconds){ this.seconds = seconds; }

    public TimeSpan(int hours,int minutes, int seconds){
        setNormalizedTime(hours, minutes, seconds);
    }

    private void setNormalizedTime(int hours, int minutes, int seconds){
        if (hours < 0 || minutes < 0 || seconds < 0)
            throw new IllegalArgumentException("Время не может быть отрицательным.");

        int totalSeconds = hours*3600 + minutes*60 + seconds;
        this.hours = totalSeconds / 3600;
        this.minutes = (totalSeconds % 3600)/60;
        this.seconds = totalSeconds % 60;
    }

    void add(TimeSpan time){
        setNormalizedTime(hours+this.hours, minutes+this.minutes,seconds+this.seconds);
    }

    void subtract(TimeSpan time){
        if ((time.hours * 3600 + time.minutes * 60 + time.seconds) > (hours * 3600 + minutes * 60 + seconds)){
            hours = 0;
            minutes = 0;
            seconds = 0;
        }
        else{
            setNormalizedTime(hours-this.hours, minutes-this.minutes,seconds-this.seconds);        }
    }

    public String toString(){
        return hours + ":" + minutes + ":" + seconds;
    }
}
