package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
    TimeSpan t1 = new TimeSpan(1,0,0);
    TimeSpan t2 = new TimeSpan(0,20,0);
    t1.subtract(t2);
    t1.toString();
    System.out.println(t1);
    }
}
