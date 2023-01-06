package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan time1 = new TimeSpan(13, 37, 14);
        TimeSpan time2 = new TimeSpan(1, 40, 40);
        System.out.println(time1);
        System.out.println(String.format("adding " + time2));
        time1.add(time2);
        System.out.println(time1);
    }
}
