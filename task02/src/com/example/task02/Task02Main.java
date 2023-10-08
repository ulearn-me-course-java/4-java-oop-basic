package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan time1 = new TimeSpan(4, 30, 45);
        TimeSpan time2 = new TimeSpan(0, 45, 15);

        System.out.println("Time 1: " + time1);
        System.out.println("Time 2: " + time2);

        time1.add(time2);
        System.out.println("Time 1 after addition: " + time1);

        time1 = new TimeSpan(4, 30, 45);
        time2 = new TimeSpan(0, 45, 15);

        time1.subtract(time2);
        System.out.println("Time 1 after subtraction: " + time1);
    }
}