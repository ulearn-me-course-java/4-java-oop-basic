package com.example.task02;

import java.text.MessageFormat;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(int hours, int minutes, int seconds){
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public void add(TimeSpan ts){
        hours += ts.hours;
        minutes += ts.minutes;
        seconds += ts.seconds;
    }

    public void subtract(TimeSpan ts){
        hours -= ts.hours;
        minutes -= ts.minutes;
        seconds -= ts.seconds;
    }

    @Override
    public String toString() {
        return MessageFormat.format("{0}:{1}:{2}", hours, minutes, seconds);
    }
}
