package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {

        ComplexNumber num = new ComplexNumber(3, -4);
        ComplexNumber num2 = new ComplexNumber(1, 2);

        System.out.println(num + " and " + num2);
        System.out.println("Sum: " + num.sumWith(num2));
        System.out.println("Diff: " + num.diffWith(num2));
        System.out.println("Comp: " + num.compWith(num2));
        System.out.println("Div: " + num.divWith(num2));

    }
}
final class ComplexNumber{

    private double a;
    private double b;
    public ComplexNumber(double a, double b){
        this.a = a;
        this.b = b;
    }
    public ComplexNumber(){}

    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public ComplexNumber sumWith(ComplexNumber second){
        return new ComplexNumber(this.a + second.a, this.b + second.b);
    }
    public ComplexNumber diffWith(ComplexNumber second){
        return new ComplexNumber(this.a - second.a, this.b - second.b);
    }
    public ComplexNumber compWith(ComplexNumber second){
        return new ComplexNumber(this.a * second.a - this.b * second.b, this.a * second.b + this.b * second.a);
    }
    public ComplexNumber divWith(ComplexNumber second){
        double new_a = (this.a*second.a + this.b * second.b) / (Math.pow(second.a, 2) + Math.pow(second.b, 2));
        double new_b = (this.b * second.a - this.a * second.b) / (Math.pow(second.a, 2) + Math.pow(second.b, 2));
        return new ComplexNumber(new_a, new_b);
    }

    @Override
    public String toString() {
        return a + (b > 0? " + " : " - ")  + (b > 0? b : -1 * b) + "i";

    }
}
