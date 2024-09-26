package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan t=new TimeSpan(1,30,40);
        TimeSpan t1=new TimeSpan(2,30,40);
        TimeSpan t2=new TimeSpan(0,14,56);
        TimeSpan t3=new TimeSpan(2,11,53);
        //t.setHours(3);
        //t.subtract(t1);
        //t.subtract(t2);
        t.subtract(t2);
        System.out.println(t.toString());
    }
}
