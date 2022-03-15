package com.example.task02;

public class TimeSpan {
    private double timeInHours;
    private double timeInMinutes;
    private double timeInSeconds;

    public TimeSpan(double hours, double minutes, double seconds){
        timeInHours = hours;
        timeInMinutes = minutes;
        timeInSeconds = seconds;
        timeDistribution();
    }
    private void timeDistribution(){
        while (timeInMinutes > 60 && timeInMinutes >= 0) {
            timeInMinutes -= 60;
            timeInHours += 1;
        }
        while (timeInSeconds > 60 && timeInSeconds >= 0) {
            timeInSeconds -= 60;
            timeInMinutes += 1;
        }
    }
    public double getHours()
    {
        return  timeInHours;
    }
    public void getHours(double temp)
    {
        timeInHours = temp;
    }

    public double getMinutes()
    {
        return  timeInMinutes;
    }
    public void setMinutes(double temp)
    {
        timeInMinutes = temp;
    }

    public double getSeconds()
    {
        return  timeInSeconds;
    }
    public void setSeconds(double temp)
    {
        timeInSeconds = temp;
    }
    public void add(TimeSpan time) {
        timeInHours += time.getHours();
        timeInMinutes += time.getMinutes();
        timeInSeconds += time.getSeconds();
        timeDistribution();
    }
    public void subtract(TimeSpan time) {
        timeInHours = Math.abs(timeInHours - time.getHours());
        if (timeInMinutes - time.getMinutes() < 0) {
            timeInHours -= 1;
            timeInMinutes = Math.abs(timeInMinutes - time.getMinutes());
        }
        if (timeInSeconds - time.getSeconds() < 0) {
            timeInMinutes -= 1;
            timeInSeconds = Math.abs(timeInSeconds - time.getSeconds());
        }
        timeDistribution();
    }
    public String toString()
    {
        String timeToString = String.format("(%f, %f, %f)", timeInHours, timeInMinutes, timeInSeconds);
        return timeToString;
    }
}
