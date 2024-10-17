package com.example.task02;

public class TimeSpan {
    private int Hours;
    private int Minutes;
    private int Seconds;

    public TimeSpan(int hours, int minutes, int seconds){
        this.Hours = hours;
        this.Minutes = minutes;
        this.Seconds = seconds;
        TimeConvert();
    }
    public int get_hours() {
        return Hours;
    }
    public void set_hours(int hours) {
        Hours = hours;
    }
    public int get_minutes() {
        return Minutes;
    }
    public void set_minutes(int minutes) {
        TimeConvert();
        Minutes = minutes;
    }

    public int get_seconds() {
        return Seconds;
    }
    public void set_seconds(int seconds) {
        TimeConvert();
        Seconds = seconds;
    }
    void TimeConvert(){
        if (Seconds >= 60){
            Minutes += Seconds / 60;
            Seconds %= 60;
        }
        if (Minutes >= 60){
            Hours += Minutes / 60;
            Minutes %= 60;
        }
    }
    void TimeConvert(int seconds){
        Hours = seconds / 3600;
        seconds = seconds % 3600;
        Minutes = seconds / 60;
        Seconds = seconds % 60;
    }
    void add(TimeSpan time){
        this.Hours += time.Hours;
        this.Minutes += time.Minutes;
        this.Seconds += time.Seconds;
        TimeConvert();
    }
    private int ToSeconds(TimeSpan time){
        return time.Hours*3600 + time.Minutes*60 + time.Seconds;
    }
    void subtract(TimeSpan time){
        int First_time = ToSeconds(new TimeSpan(this.Hours, this.Minutes, this.Seconds));
        int Second_time =ToSeconds(time);
        TimeConvert(First_time - Second_time);
    }
    public String toString(){
        return Hours + ":" + Minutes + ":" + Seconds;
    }
}
