package com.example.task02;

public class TimeSpan {
   private int hours;
   private int minutes;
   private int seconds;

    public TimeSpan(int hours, int minutes, int seconds) {

        Convert(hours,minutes,seconds);
    }

    public int getHours() {

        return  hours;
    }
    public void setHours(int hours) {

            this.hours = hours;
    }

    public int getMinutes() {

        return minutes;
    }
    public void setMin(int minutes) {

            this.minutes =  minutes;
    }
    public int getSeconds() {

        return seconds;
    }
    public void setSeconds(int seconds) {

            this.seconds =  seconds;
    }
    public void Convert(int hours, int minutes, int seconds){

        if ( minutes >= 60) {
            hours += minutes / 60;
            minutes %= 60;
        }

        if ( seconds >= 60) {
            minutes += seconds / 60;
            seconds = seconds % 60;
        }
        setHours(hours);
        setMin(minutes);
        setSeconds(seconds);
    }
    public void add(TimeSpan time) {

        int hour = getHours();
        int minute = getMinutes();
        int second = getSeconds();
        hour += time.getHours();
        minute += time.getMinutes();
        second += time.getSeconds();
        Convert(hour,minute,second);
    }

    public void subtract(TimeSpan time) {

        int hour = getHours();
        int minute = getMinutes();
        int second = getSeconds();

        hour -= time.getHours();
        minute -= time.getMinutes();
        second -= time.getSeconds();
        Convert(hour,minute,second);
    }

    public String toString() {

        return String.format("%s hours, %s minutes, %s seconds", hours, minutes, seconds);
    }
}

