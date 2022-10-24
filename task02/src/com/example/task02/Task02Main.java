package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan time1 = new TimeSpan(18, 23, 15);
        TimeSpan time2 = new TimeSpan(1, 20, 14);
        System.out.println(time1);
        time1.add(time2);
        System.out.println(time1);
    }
}
