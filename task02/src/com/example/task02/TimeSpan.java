package com.example.task02;

public class TimeSpan {
    private int _hours;
    private int _minutes;
    private int _seconds;

    public TimeSpan(int hours, int minutes, int seconds){
        _hours = hours;
        _minutes = minutes;
        _seconds = seconds;
    }

    public void add(TimeSpan time){
        this._hours+= time.get_hours();
        this._minutes+= time.get_minutes();
        this._seconds+= time.get_seconds();
    }

    public void subtract(TimeSpan time){
        this._hours-= time.get_hours();
        this._minutes-= time.get_minutes();
        this._seconds-= time.get_seconds();
    }

    @Override
    public String toString(){
        return "h:" + _hours + " m:" + _minutes + " s:" + _seconds;
    }

    public int get_hours(){
        return _hours;
    }

    public void set_hours(int hours){
        _hours = hours;
    }

    public void set_minutes(int minutes){
        _minutes = minutes;
    }

    public int get_minutes(){
        return _minutes;
    }

    public void set_seconds(int seconds){
        _seconds = seconds;
    }

    public int get_seconds(){
        return _seconds;
    }
}
