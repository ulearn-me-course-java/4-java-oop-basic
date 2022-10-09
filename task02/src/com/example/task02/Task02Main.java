package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan time1 = new TimeSpan(20, 12, 1200);
        TimeSpan time2 = new TimeSpan(30, 122, 120);

        System.out.println(time1);
        System.out.println(time2);

        time1.add(time2);
        System.out.println(time1);
    }
}
