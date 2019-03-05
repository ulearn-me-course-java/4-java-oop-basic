package com.example.task02;

public class TimeSpan {
    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMins() {
        return mins;
    }

    public void setMins(int mins) {
        this.mins = mins;
    }

    public int getSecs() {
        return secs;
    }

    public void setSecs(int secs) {
        this.secs = secs;
    }

    private int hours;
    private int mins;
    private int secs;

    public TimeSpan(int hours, int mins, int secs) {
        this.hours = hours;
        this.mins = mins;
        this.secs = secs;
    }

    void add(TimeSpan time) throws NullPointerException {
        hours += time.hours;
        //if ((mins += time.mins) > 60)
        mins += time.mins;
        secs += time.secs;
    }

    void subtract(TimeSpan time) throws NullPointerException {
        hours -= time.hours;
        mins -= time.mins;
        secs -= time.secs;
    }

    @Override
    public String toString() {
        return String.format("hh: %b; mm: %b; ss: %b", hours, mins, secs);
    }
}
