package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        //TimeSpan a = new TimeSpan(0, 0, 90);
        TimeSpan a = new TimeSpan(3, 90, 70);
        TimeSpan b = new TimeSpan(-1, -120, 900);
        System.out.println(a);
        System.out.println(b);
        a.add(b);
        System.out.println(a);
    }
}
