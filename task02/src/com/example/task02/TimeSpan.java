package com.example.task02;

public class TimeSpan {

    private int _hours;
    private int _minutes;
    private int _seconds;

    TimeSpan() {
        _hours = 0;
        _minutes = 0;
        _seconds = 0;
    }

    public TimeSpan(int hours, int minutes, int seconds) {

        _hours = hours;
        _minutes = minutes;
        _seconds = seconds;

        normalize();
    }


    public int get_hours() {
        return _hours;
    }

    public void set_hours(int _hours) {
        this._hours = _hours;
    }


    public int get_minutes() {
        return _minutes;
    }

    public void set_minutes(int _minutes) {
        this._minutes = _minutes;
    }


    public int get_seconds() {
        return _seconds;
    }

    public void set_seconds(int _seconds) {
        this._seconds = _seconds;
    }


    void add(TimeSpan time) {
        _hours += time._hours;
        _minutes += time._minutes;
        _seconds += time._seconds;

        normalize();
    }

    void subtract(TimeSpan time) {
        _hours -= time._hours;
        _minutes -= time._minutes;
        _seconds -= time._seconds;

        normalize();
    }

    private void normalize() {

        while (_seconds >= 60) {
            _seconds -= 60;
            _minutes++;
        }

        while (_minutes >= 60) {
            _minutes -= 60;
            _hours++;
        }

        while (_hours >= 24) {
            _hours -= 24;
        }

        while (_seconds < 0) {
            _seconds += 60;
            _minutes--;
        }

        while (_minutes < 0) {
            _minutes += 60;
            _hours--;
        }

        while (_hours < 0) {
            _hours += 24;
        }
    }


    public String toString() {
        return String.format("(Time(h:m:s): %d:%d:%d)", _hours, _minutes, _seconds);
    }
}