package com.example.task02;

import java.sql.Time;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

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
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    TimeSpan(int h, int m, int s) {
        this.hours = h;
        this.minutes = m;
        this.seconds = s;
        this.minutes+=this.seconds/60;
        this.seconds%=60;
        this.hours+=this.minutes/60;
        this.minutes%=60;
    }

    TimeSpan(){
        this(0,0,0);
    }

    void add(TimeSpan ts){
        this.hours+=ts.hours;
        this.minutes+=ts.minutes;
        this.seconds+=ts.seconds;
        this.minutes+=this.seconds/60;
        this.seconds%=60;
        this.hours+=this.minutes/60;
        this.minutes%=60;
    }

    void subtract(TimeSpan ts){
        this.hours-=ts.hours;
        this.minutes-=ts.minutes;
        this.seconds-=ts.seconds;
        if (this.seconds<0){
            while(this.seconds<0)
            {
                this.seconds+=60;
                this.minutes-=1;
            }
        }
        if (this.minutes<0){
            while(this.minutes<0){
                this.minutes+=60;
                this.hours-=1;
            }
        }
    }
    public String toString(){
        return "Hours: "+Integer.toString(this.hours)+" Minutes: "+Integer.toString(this.minutes)+" Seconds "+Integer.toString(this.seconds);
    }
}
