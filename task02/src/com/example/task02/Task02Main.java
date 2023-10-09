package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan time1 = new TimeSpan(6, 78, 1456);
        TimeSpan time2 = new TimeSpan(8, 56, 3);
        time1.subtract(time2);
        System.out.println(time1);
    }
}
