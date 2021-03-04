package com.example.task02;

public class TimeSpan {
    private int _hours;
    private int _minutes;
    private int _seconds;

    public TimeSpan() {
    }

    public TimeSpan(int hours, int minutes, int seconds) throws Exception {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public int getHours() {
        return _hours;
    }

    public void setHours(int hours) throws Exception {
        if (hours < 0)
            throw new Exception("The hours must not be negative");
        _hours = hours;
    }

    public int getMinutes() {
        return _minutes;
    }

    public void setMinutes(int minutes) throws Exception {
        if (minutes < 0)
            throw new Exception("The minutes must not be negative");
        _minutes = minutes;
        calculate();
    }

    public int getSeconds() {
        return _seconds;
    }

    public void setSeconds(int seconds) throws Exception {
        if (seconds < 0)
            throw new Exception("The seconds must not be negative");
        _seconds = seconds;
        calculate();
    }

    void add(TimeSpan time) {
        _hours += time._hours;
        _minutes += time._minutes;
        _seconds += time._seconds;
        calculate();
    }

    void subtract(TimeSpan time) {
        _hours -= time._hours;
        _minutes -= time._minutes;
        _seconds -= time._seconds;
        calculate();
    }

    private void calculate() {
        _minutes += _seconds / 60;
        _seconds %= 60;
        _hours += _minutes / 60;
        _minutes %= 60;
        if (_hours < 0) {
            setToZero();
        }
        if (_minutes < 0) {
            if (_hours > 0) {
                _hours -= 1;
                _minutes += 60;
            } else {
                setToZero();
            }
        }
        if (_seconds < 0) {
            if (_minutes > 0) {
                _minutes -= 1;
                _seconds += 60;
            }
            else if (_hours > 0) {
                _hours -= 1;
                _minutes += 59;
                _seconds += 60;
            } else {
                setToZero();
            }
        }
    }

    private void setToZero() {
        _hours = 0;
        _minutes = 0;
        _seconds = 0;
    }

    public String toString() {
        return String.format("%s:%s:%s", _hours, _minutes, _seconds);
    }
}
