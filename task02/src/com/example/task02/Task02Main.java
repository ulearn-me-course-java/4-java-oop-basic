package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan time = new TimeSpan();
        time.setHour(10);
        time.setMin(10);
        TimeSpan time1 = new TimeSpan();
        time1.setHour(2);
        time.subtract(time1);
        System.out.println(time);
    }
}
