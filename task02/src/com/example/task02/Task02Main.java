package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan time = new TimeSpan(0,100,0);
        System.out.println(time.getHours());
        System.out.println(time.getMinutes());
        TimeSpan time1 = new TimeSpan(0, 100, 0);
        time.add(time1);
        System.out.println(time.getHours());
        System.out.println(time.getMinutes());
        time.subtract(time1);
        System.out.println(time.getHours());
        System.out.println(time.getMinutes());
        time.toString();
    }
}
