package com.example.task02;

public class TimeSpan {

    private int hours;
    public int getHours(){
        return this.hours;
    }
    public void setHours(int hours){
        this.hours = hours;
    }

    private int minutes;
    public int getMinutes() {
        return minutes;
    }
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    private int seconds;
    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public TimeSpan(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;

        ConvertToTrueFormat();
    }

    private void ConvertToTrueFormat(){
        if(this.seconds >= 60){
            this.minutes += this.seconds / 60;
            this.seconds %= 60;

            this.hours += this.minutes / 60;
            this.minutes %= 60;
        }
    }

    void add(TimeSpan time){
        this.hours += time.hours;
        this.minutes += time.minutes;
        this.seconds += time.seconds;

        ConvertToTrueFormat();
    }

    void subtract(TimeSpan time){
        this.hours -= time.hours;
        this.minutes -= time.minutes;
        this.seconds -= time.seconds;

        ConvertToTrueFormat();
    }

    public String toString(){
        return this.hours + ":" + this.minutes + ":" + this.minutes;
    }

}
