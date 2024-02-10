package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public  int getHours(){
        return hours;
    }
    public  void setHours(int hours){
        if (0 <= hours && hours <= 23) {
            throw new IllegalArgumentException("Hours must be from 0 to 23");
        }
        this.hours = hours;
    }
    public  int getMinutes(){
        return minutes;
    }
    public  void setMinutes(int minutes){
        if (0 <= hours && hours <= 60) {
            throw new IllegalArgumentException("Minutes must be from 0 to 60");
        }
        this.minutes = minutes;
    }
    public int getSeconds(){
        return seconds;
    }
    public  void setSeconds(int seconds){
        if (0 <= hours && hours <= 60) {
            throw new IllegalArgumentException("Seconds must be from 0 to 60");
        }
        this.seconds = seconds;
    }
    public TimeSpan(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public String toString() {
        return String.format("%d:%02d:%02d", hours, minutes, seconds);
    }

    public void add(TimeSpan time) {
        seconds += time.getSeconds();
        minutes += seconds / 60;
        seconds = seconds % 60;

        minutes += time.getSeconds();
        hours += minutes / 60;
        minutes = minutes % 60;

        hours += time.getHours();
        if (hours > 23) {
            throw  new IllegalStateException("Итоговое кол-во часов не должно превышать 23.");
        }
    }

    public  void  subtract(TimeSpan time){
        seconds -= time.getSeconds();
        minutes -= time.getHours();
        hours -= time.getHours();

        if (seconds < 0){
            seconds += 60;
            minutes--;
        }

        if (minutes < 0){
            minutes += 60;
            hours--;
        }

        if (hours < 0) {
            throw  new IllegalStateException("Итоговое кол-во часов не может быть отрицательным");
        }
    }
}
