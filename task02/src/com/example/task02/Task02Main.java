package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan time = new TimeSpan(8, 32, 50);
        TimeSpan time2 = new TimeSpan(4, 2, 5);

        time.add(time2);
        System.out.println(time.toString());
    }
}


