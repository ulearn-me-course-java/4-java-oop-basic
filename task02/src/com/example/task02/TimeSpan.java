package com.example.task02;

public class TimeSpan {
    private byte hours;
    private byte minutes;
    private byte seconds;

    public TimeSpan(byte h, byte m, byte s){
        hours = h;
        minutes = m;
        seconds = s;
    }

    public byte getHours(){ return hours; }
    public byte getMinutes() { return minutes; }
    public byte getSeconds() { return seconds; }

    public void setHours(byte h) { hours = h; }
    public void setMinutes(byte m) { minutes = m; }
    public void setSeconds(byte s) { seconds = s; }

    void add(TimeSpan time){
        this.hours += time.hours;
        this.minutes += time.minutes;
        this.seconds += time.seconds;
    }

    void subtract(TimeSpan time){
        this.hours -= time.hours;
        this.minutes -= time.minutes;
        this.seconds -= time.seconds;
    }

    public String toString(){
        return String.format("%d:%d.%d", this.hours, this.minutes, this.seconds);
    }
}