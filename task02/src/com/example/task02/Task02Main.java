package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan ts1 = new TimeSpan();
        ts1.setSecond(650);
        ts1.setHour(4);
        TimeSpan ts2 = new TimeSpan(12, 33, 62);
        TimeSpan ts3 = new TimeSpan(12, 34, 2);

        System.out.println(ts1);
        System.out.println(ts2);
        System.out.println(ts3);

        ts1.add(ts2);
        System.out.println(ts1);

        ts1.subtract(ts3);
        System.out.println(ts1);
    }
}
