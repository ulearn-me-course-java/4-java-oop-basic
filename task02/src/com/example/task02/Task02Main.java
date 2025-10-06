package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan time = new TimeSpan(0,71,80);
        System.out.println(time.getSeconds());
        System.out.println(time.getMinutes());
        System.out.println(time.getHours());

        System.out.println(time.toString());
    }
}
