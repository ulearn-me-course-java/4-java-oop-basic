package com.example.task02;

import java.sql.Time;
import java.text.MessageFormat;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(int h, int m, int s) {
        hours = h;
        minutes = m;
        seconds = s;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        int h = minutes / 60;
        int m = minutes % 60;

        hours = h;
        minutes = m;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        int h = seconds / 3600;
        int m = seconds % 3600 / 60;
        int s = seconds % 3600 % 60;

        hours = h;
        minutes = m;
        seconds = s;
    }

    private void addAndSeparateMinutes(int m1, int m2) {
        hours += (m1 + m2) / 60;
        minutes += (m1 + m2) % 60;
    }

    private void subAndSeparateMinutes(int m1, int m2) {
        hours -= (m1 - m2) / 60;
        minutes -= (m1 - m2) % 60;
    }

    public void add(TimeSpan time) {
        hours += time.hours;

        if (minutes + time.minutes >= 60)
            addAndSeparateMinutes(minutes, time.minutes);
        else
            minutes += time.minutes;

        if (seconds + time.seconds >= 60) {
            int tempMinutes = time.seconds / 60;
            if (minutes + tempMinutes >= 60) {
                addAndSeparateMinutes(minutes, tempMinutes);
            }
            seconds += (seconds + time.seconds) % 60;
        }
        else
            seconds += time.seconds;
    }

    public void subtract(TimeSpan time) {
        hours -= time.hours;

        if (minutes - time.minutes < 0)
            subAndSeparateMinutes(minutes, time.minutes);
        else
            minutes -= time.minutes;

        if (seconds - time.seconds < 0) {
            int tempMinutes = time.seconds / 60;
            if (minutes - tempMinutes < 0) {
                subAndSeparateMinutes(minutes, tempMinutes);
            }
            seconds -= (seconds - time.seconds) % 60;
        }
        else
            seconds -= time.seconds;
    }

    public String toString() {
        return MessageFormat.format("Time — {0}h:{1}m:{2}s", hours, minutes, seconds);
    }
}
