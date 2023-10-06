package com.example.task02;

public class TimeSpan {
    private int _hours;
    private int _minutes;
    private int _seconds;
    public int getHours() { return _hours; }
    public int getMinutes() { return _minutes; }
    public int getSeconds() { return _seconds; }

    public TimeSpan(int hours, int minutes, int seconds){
        _hours = hours;
        _minutes = minutes;
        _seconds = seconds;
        validate();
    }

    private void validate(){
        _minutes += _seconds / 60;
        _seconds %= 60;
        _hours += _minutes / 60;
        _minutes %= 60;
    }

    void add(TimeSpan time) {
        this._hours += time._hours;
        this._minutes += time._minutes;
        this._seconds += time._seconds;
        validate();
    }

    void subtract(TimeSpan time){
        if(time._hours > this._hours) { return; }
        this._hours -= time._hours;

        if(time._minutes > this._minutes){
            if(this._hours > 0){
                this._hours -= 1;
                this._minutes += 60 - time._minutes;
            }
            else{
                this._hours += time._hours;
                return;
            }
        }
        this._minutes -= time._minutes;

        if(time._seconds > this._seconds){
            if(this._minutes > 0){
                this._minutes -= 1;
                this._seconds += 60 - time._seconds;
            }
            else{
                if(this._hours > 0){
                    this._hours -= 1;
                    this._minutes += 59;
                    this._seconds += 60 - time._seconds;
                }
                else {
                    this._hours += time._hours;
                    this._minutes += time._minutes;
                    return;
                }
            }
        }
        this._seconds -= time._seconds;
    }

    public String toString(){
        return String.format("%d:%d:%d", _hours, _minutes, _seconds);
    }
}
