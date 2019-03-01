package com.example.task02;

public class TimeSpan {
    private long totalSeconds;

    public TimeSpan(int hour, int minute, int second) {
        this.totalSeconds = Math.max(0, hour * 3600 + minute * 60 + second);
    }

    void add(TimeSpan time) {
        totalSeconds += time.totalSeconds;
    }

    void subtract(TimeSpan time) {
        totalSeconds -= time.totalSeconds;
        if(totalSeconds < 0) totalSeconds = 0;
    }

    public String toString() {
        return getHour() + ":" + format(getMinute()) + ":" + format(getSecond());
    }

    private String format(long unit) {
        String s = "0" + unit;
        return s.substring(s.length() - 2);
    }

    public long getHour() {
        return totalSeconds / 3600;
    }

    public void setHour(int hour) {
        totalSeconds = totalSeconds % 3600 + hour * 3600;
    }

    public long getMinute() {
        return totalSeconds % 3600 / 60;
    }

    public void setMinute(int minute) {
        totalSeconds = totalSeconds - getMinute() + minute * 60;
    }

    public long getSecond() {
        return totalSeconds % 60;
    }

    public void setSecond(int second) {
        totalSeconds = totalSeconds - getSecond() + second;
    }
}
