package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int secs;

    TimeSpan(){}
    TimeSpan(int hours, int minutes, int secs){
        this.hours = hours + minutes / 60 + secs / 3600;
        this.minutes = (secs / 60 + minutes) % 60;
        this.secs = secs % 60;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSecs() {
        return secs;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSecs(int secs) {
        this.secs = secs;
    }
    void add(TimeSpan time){
        int tmpSecs = (this.secs + time.secs) / 60;
        int tmpMinutes = (this.minutes + time.minutes) / 60;
        this.secs = (this.secs + time.secs) % 60;
        this.minutes  = (this.minutes + time.minutes + tmpSecs) % 60;
        this.hours = (this.hours + time.hours + tmpMinutes);
    }
    void subtract(TimeSpan time){
        if (this.secs < time.secs || this.minutes < time.minutes || this.hours < time.hours) {
            System.out.println("Incorrect operation");
        }
        else {
            this.hours = this.hours - time.hours;
            this.minutes = this.minutes - time.minutes;
            this.secs = this.secs - time.secs;
            if (this.secs < 0){
                while(this.secs < 0)
                {
                    this.secs = this.secs + 60;
                    this.minutes = this.minutes - 1;
                }
            }
            if (this.minutes < 0){
                while(this.minutes < 0){
                    this.minutes = this.minutes + 60;
                    this.hours = this.hours - 1;
                }
            }
        }
    }
    public String toString(){
        return String.format("(%d Hours :: %d Minutes :: %d Seconds)",this.hours , this.minutes, this.secs);
    }
}
