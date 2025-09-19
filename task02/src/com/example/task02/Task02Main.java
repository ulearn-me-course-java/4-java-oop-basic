package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan time1 = new TimeSpan(0,59,59);
        TimeSpan time2 = new TimeSpan(0,0,1);
        time1.add(time2);
        System.out.println(time1.toString());
        time1.setSeconds(60);
        System.out.println(time1.toString());
    }
}
