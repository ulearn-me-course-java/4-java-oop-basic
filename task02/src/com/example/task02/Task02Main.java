package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan timeSpan = new TimeSpan(10,10,10);
        timeSpan.add(new TimeSpan(1,1,1));
        System.out.println(timeSpan.toString());
    }
}
