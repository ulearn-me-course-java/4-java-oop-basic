package com.example.task02;

public class TimeSpan {
    private int seconds;
    private int minutes;
    private int hours;

    public TimeSpan(int seconds, int minutes, int hours){
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;

        convertDate();
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    private void convertDate(){
        if (this.seconds >= 60){
            this.minutes += this.seconds / 60;
            setSeconds(getSeconds() - (getSeconds() /60) * 60);
        }
        if (this.minutes >= 60) {
            this.hours += this.minutes / 60;
            setMinutes(getMinutes() - (getMinutes() / 60) * 60);
        }
    }

    void add(TimeSpan time){
        setSeconds(getSeconds() + time.getSeconds());
        setMinutes(getMinutes() + time.getMinutes());
        setHours(getHours() + time.getHours());
        convertDate();
    }

    void subtract(TimeSpan time){
        setSeconds(getSeconds() - time.getSeconds());
        setMinutes(getMinutes() - time.getMinutes());
        setHours(getHours() - time.getHours());
        convertDate();
    }

    public String toString(){
        return String.format("%d hours, %d minutes, %d seconds",getHours(),getMinutes(),getSeconds());
    }
}
