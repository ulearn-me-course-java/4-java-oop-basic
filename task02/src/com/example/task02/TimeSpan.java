package com.example.task02;

public class TimeSpan {
    private int hours, minutes, seconds;

    public int getHours() {
        return hours;
    }

    public void setHours(int hour) {
        hours = hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minute) {
        minutes = minute;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int second) {
        seconds = second;
    }

    private void convertTime(){
        minutes += seconds / 60;
        seconds = seconds % 60;

        hours += minutes / 60;
        minutes = minutes % 60;
    }

    public TimeSpan(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;

        this.convertTime();
    }

    public void add(TimeSpan time) {
        seconds += time.seconds;
        minutes += time.minutes;
        hours += time.hours;

        this.convertTime();
    }

    private void toSeconds(){
        minutes += hours * 60;
        hours = 0;

        seconds += minutes * 60;
        minutes = 0;
    }

    public void subtract(TimeSpan time) {
        time.toSeconds();
        this.toSeconds();

        if(this.seconds - time.seconds < 0){
            System.out.println("Невозможно вычесть.");
        }
        else {
            this.seconds -= time.seconds;
        }

        this.convertTime();
    }

    public String toString() {
        return "(" + hours + ", " + minutes + ", " + seconds + ")";
    }
}
