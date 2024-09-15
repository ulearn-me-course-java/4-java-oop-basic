package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan ts = new TimeSpan(4, 2, 30);
        ts.add(new TimeSpan(4, 2, 31));
        ts.subtract(new TimeSpan(2,1,3));
        System.out.println(ts.toString());
    }
}
