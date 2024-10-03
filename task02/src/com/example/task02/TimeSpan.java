package com.example.task02;

public class TimeSpan {
    private int hours = 0;
    private int minutes = 0;
    private int seconds = 0;

    public TimeSpan(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        Check();
    }


//  метод, который должен прибавлять к текущему интервалу
//  значение переданного интервала
    public void add(TimeSpan time) {
        hours += time.GetHours();
        minutes += time.GetMinutes();
        seconds += time.GetSeconds();
        Check();
    }
//  метод, который должен вычитать из текущего интервала
//  значение переданного интервала
    public void subtract(TimeSpan time) {
        hours -= time.GetHours();
        minutes -= time.GetMinutes();
        seconds -= time.GetSeconds();
        Check();
    }

//            метод, который должен возвращать строковое представление интервала

    public String toString(){
        return hours + ":" + minutes + ":" + seconds;
    }

    private void Check(){
        while (seconds > 60){
            seconds -= 60;
            minutes ++;
        }
        while (minutes > 60){
            minutes -= 60;
            hours ++;
        }

        if (seconds < 0){
            minutes--;
            seconds = 60 + minutes;
        }
        if (minutes < 0){
            hours--;
            minutes = 60 + minutes;
        }
    }

    public int GetHours() { return hours; }
    public int GetMinutes() { return minutes; }
    public int GetSeconds() { return seconds; }

    public void SetHours(int hours) { this.hours = hours; }
    public void SetMinutes(int minutes) { this.minutes = minutes; }
    public void SetSeconds(int seconds) { this.seconds = seconds; }
}
