package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan time1 = new TimeSpan(0,60,0);
        System.out.println(time1);
        TimeSpan time2 = new TimeSpan(0,0,2);
        System.out.println(time2);

        time1.subtract(time2);
        System.out.println("subtract = " + time1);

    }
}
