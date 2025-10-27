package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan time1 = new TimeSpan(3, 30, 60);
        System.out.println(time1.toString());
        TimeSpan time2 = new TimeSpan(1, 45, 0);
        System.out.println(time2.toString());
        time1.subtract(time2);
        System.out.println(time1.toString());
        time1.setSeconds(59);
        System.out.println(time1.toString());
    }
}
