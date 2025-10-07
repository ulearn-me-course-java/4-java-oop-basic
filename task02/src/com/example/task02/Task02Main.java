package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan time1 = new TimeSpan(3,34,57);
        TimeSpan time2 = new TimeSpan(0,30,15);
        time1.add(time2);
        System.out.println(time1.toString());
        time1.setSeconds(90);
        System.out.println(time1.toString());

    }
}
