package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan time1 = new TimeSpan(12, 35, 0);
        TimeSpan time2 = new TimeSpan(0, 452, 67);

        System.out.println(time1);
        time1.add(time2);
        System.out.println(time1);
        System.out.println(time2);
    }
}
