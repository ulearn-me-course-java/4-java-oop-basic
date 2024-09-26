package com.example.task02;

import java.util.Calendar;
import java.util.Date;

public class TimeSpan {
    private long hours;
    private long minutes;
    private long seconds;
    private long currentTime;

    public TimeSpan(long hours, long minutes, long seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        currentTime = hours*3600 + minutes*60 + seconds;
    }

    public long getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public long getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public long getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    void add(TimeSpan time){
        currentTime += time.currentTime;
        refresh();
    }

    void subtract(TimeSpan time){
        currentTime -= time.currentTime;
        refresh();
    }
    private void refresh(){
        long totalSeconds = currentTime;
        seconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        minutes = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        hours = totalHours % 24;
    }

    public String toString(){
        return hours+":"+minutes+":"+seconds;
    }
}
