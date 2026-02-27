package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan t1 = new TimeSpan(0, 70, 0);
        t1.setMinutes(100);
        t1.add(new TimeSpan(0, 20, 0));
        System.out.println(t1.toString());
    }
}
