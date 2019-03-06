package com.example.task03;

public class ComplexNum {
    private double a, bi;

    public ComplexNum(double a, double bi) {
        //алг. форма: a+bi
        this.a = a;
        this.bi = bi;
    }

    double getA() {
        return a;
    }

    double getBi() {
        return bi;
    }

    public static ComplexNum sum(ComplexNum z1, ComplexNum z2) {
        return new ComplexNum(z1.getA() + z2.getA(), z1.getBi() + z2.getBi());
    }

    public static ComplexNum multi(ComplexNum z1, ComplexNum z2) {
        return new ComplexNum(z1.getA() * z2.getA() - z1.getBi() * z2.getBi(),
                z1.getA() * z2.getBi() + z1.getBi() * z2.getA());
    }

    @Override
    public String toString() {
        return String.format("(%.1f; %.1f)", a, bi);
    }
}
