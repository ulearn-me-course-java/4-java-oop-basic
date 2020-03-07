package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {

    }
}

class TimeSpan{
    private int hours;
    private int minute;
    private int seconds;
    public TimeSpan(int x,int y,int z){
        this.hours = x;
        this.minute = y;
        this.seconds = z;
        }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinute() { return minute; }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    void add(TimeSpan time){
        this.hours += time.hours;
        this.minute += time.minute;
        this.seconds += time.seconds;
    }
    void subtract(TimeSpan time){
        this.hours -= time.hours;
        this.minute -= time.minute;
        this.seconds -= time.seconds;
    }

    public String toString(){
        return this.hours+":"+this.minute+":"+this.seconds;
    }
}
