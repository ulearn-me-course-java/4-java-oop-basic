package com.example.task02;

public class TimeSpan {
    private int hour;
    private int minut;
    private int seconds;

    public int getHour() {
        return hour;
    }

    public int getMinut() {
        return minut;
    }

    public int getSeconds() {
        return seconds;
    }

    @Override
    public String toString() {
        return "hour=" + hour +
                ", minut=" + minut +
                ", seconds=" + seconds;
    }

    public TimeSpan(int hour, int minut, int seconds){
        this.hour = hour;
        this.minut = minut;
        this.seconds = seconds;
    }

    public void add(TimeSpan time){
        long second = convertToSecond(this) + convertToSecond(time);
        convertSecondToTime(second);
    }

    public void subtract(TimeSpan time){
        long second = convertToSecond(this) - convertToSecond(time);
        convertSecondToTime(second);
    }

    private long convertToSecond(TimeSpan time){
        return  ((time.hour * 60L + time.minut) * 60) + time.seconds;
    }

    private void convertSecondToTime(long second){
        long minut = second / 60;
        hour = (int)(minut / 60);
        this.minut = (int)minut - hour * 60;
        seconds = (int)(second - (60 * (minut + hour * 60)));
    }
}
