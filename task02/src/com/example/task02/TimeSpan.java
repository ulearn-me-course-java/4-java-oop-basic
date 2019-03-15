package com.example.task02;

public class TimeSpan {
    private int timeInSeconds;
    private int timeInMinutes;
    private int timeInHours;

    public void setSeconds(int seconds){
        if(seconds < 0) {
            throw new RuntimeException();
        }
        timeInSeconds = seconds;
    }

    public int getSeconds(){
        return timeInSeconds;
    }

    public void setMinutes(int minutes){
        timeInMinutes = minutes;
    }

    public int getMinutes(){
        return timeInMinutes;
    }

    public void setHours(int hours){
        timeInHours = hours;
    }
    public int getHours(){
        return timeInHours;
    }

    TimeSpan(int timeInSeconds, int timeInMinutes, int timeInHours) {
        this.timeInSeconds = timeInSeconds;
        this.timeInMinutes = timeInMinutes;
        this.timeInHours = timeInHours;
    }

    public void add(TimeSpan time){
        timeInSeconds += time.getSeconds();
        timeInMinutes += time.getMinutes();
        timeInHours += time.getHours();
    }

    public void subtract(TimeSpan time){
        timeInSeconds -= time.getSeconds();
        timeInMinutes -= time.getMinutes();
        timeInHours -= time.getHours();
    }

    public String toString(){
        return String.format("Представление времени в часах: %d, в минутах: %d, в секундах: %d)", timeInHours, timeInMinutes, timeInSeconds);
    }
    //Почему нельзя создать объект TimeSpan в другом пакете
    //Что такое инкапсуляция, полиморфизм пример
}
