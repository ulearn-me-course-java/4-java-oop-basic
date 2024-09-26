package com.example.task02;

public class TimeSpan  {
    private int hour;
    private int minute;
    private int second;


    public TimeSpan(int hours, int minutes, int seconds) {
        this.hour = hours;
        this.minute = minutes;
        this.second = seconds;
        timeCorrector();
    }
    private void timeCorrector() {
        if (second >= 60) {
            minute += second / 60;
            second %= 60;
        }
        if (minute >= 60) {
            hour += minute / 60;
            minute %= 60;
        }
    }



    public int getHour() {
        return hour;
    }

    public int getSecond() {
        return second;
    }

    public int getMinute() {
        return minute;
    }



    public void setHour(int hours) {
        this.hour = hours;
        timeCorrector();
    }

    public void setSecond(int sec) {
        this.second = sec;
        timeCorrector();
    }

    public void setMinute(int min) {
        this.minute = min;
        timeCorrector();
    }

    void add(TimeSpan time){
        this.hour += time.getHour() ;
        this.minute += time.getMinute();
        this.second += time.getSecond();
    }

    void subtract(TimeSpan time){
        this.hour -= time.getHour() ;
        this.minute -= time.getMinute();
        this.second -= time.getSecond();
    }
    public String toString(){
       return "time is: " + hour + "h, " + minute + "m, " + second + "s. ";
    }
}
