package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan myTimeSpan = new TimeSpan(6, 41, 30);
        TimeSpan myTimeSpan2 = new TimeSpan(0, 0, 24_090);
        System.out.println(myTimeSpan.toString());
        System.out.println(myTimeSpan2.toString());
    }
}
