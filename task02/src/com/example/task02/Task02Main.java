package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan t = new TimeSpan(1,100,5);
        System.out.println(t);
        t.add(new TimeSpan(1,0, 0));
        System.out.println(t);
        t.subtract(new TimeSpan(0,0,5));
        System.out.println(t);
    }
}
