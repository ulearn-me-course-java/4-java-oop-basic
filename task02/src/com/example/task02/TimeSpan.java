package com.example.task02;

public class TimeSpan {
    TimeSpan(int seconds, int minutes, int hours){
        if (seconds >= 60)
            this.seconds = seconds % 60;
        else
            this.seconds = seconds;

        if (minutes >= 60)
            this.minutes = minutes % 60;
        else
            this.minutes = minutes;

        this.minutes += seconds / 60;
        this.hours = hours;

        if (this.minutes / 60 == 1) {
            this.hours += this.minutes / 60;
            this.minutes -= 60;
        }
        this.hours += minutes / 60;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    private int seconds;

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {

        this.minutes = minutes;
    }

    private int minutes;

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    private int hours;

    void add(TimeSpan time){
        this.seconds += time.getSeconds();
        this.minutes += time.getMinutes();
        this.hours += time.getHours();

        if (this.seconds >= 60) {
            this.seconds = seconds % 60;
            this.minutes += 1;
        }
        if (this.minutes >= 60) {
            this.minutes = minutes % 60;
            this.hours += 1;
        }
    }

    public String toString(){
        return String.format("seconds - %d ,minutes - %d,hours - %d", seconds, minutes, hours);
    }

    void subtract(TimeSpan time){
        this.seconds -= time.getSeconds();
        this.minutes -= time.getMinutes();
        this.hours -= time.getHours();
        if (seconds < 0 | minutes < 0 | hours < 0)
            try {
                throw new Exception("Negative time is unacceptable");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
    }
}
