package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan time = new TimeSpan(40, 50, 50);
        TimeSpan time2 = new TimeSpan(30, 20, 85);
        time.add(time2);
        System.out.println(time.toString());
    }
}
class TimeSpan{

    private int hour;
    private int minute;
    private int second;
    public TimeSpan(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        correctTime();
    }
    public TimeSpan(){}
    public int getHour(){
        return hour;
    }
    public void setHour(int hour){
        this.hour = hour;
    }
    public int getMinute(){
        return minute;
    }
    public void setMinute(int minute){
        this.minute = minute;
        correctTime();
    }
    public int getSecond(){
        return second;
    }
    public void setSecond(int second){
        this.second = second;
        correctTime();
    }
    private void correctTime(){
        if(second > 60){
            minute+=second/60;
            second = second - second / 60 * 60;
        }
        if(minute > 60){
            hour += minute / 60;
            minute = minute - minute / 60 * 60;
        }
    }
    public void add(TimeSpan time){
        this.hour += time.hour;
        this.minute += time.minute;
        this.second += time.second;
        correctTime();
    }
    public void subtract(TimeSpan time) throws Exception {
        if(time.hour > hour){
            time.hour -= hour;
            hour = 0;
            time.minute += time.hour * 60;
            time.hour = 0;
        }
        else
            hour -= time.hour;

        if(time.minute > minute){
            time.minute -= minute;
            minute = 0;
            time.second += time.minute * 60;
            time.minute = 0;
        }
        else
            minute -= time.minute;

        if(time.second > second)
            throw new Exception("Invalid time");
        else
            second -= time.second;

    }

    @Override
    public String toString() {
        return "TimeSpan{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                '}';
    }
}
