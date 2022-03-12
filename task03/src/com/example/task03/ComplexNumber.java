package com.example.task03;

public class ComplexNumber {

    private double a;
    private double b;

    public ComplexNumber(String num) throws Exception {

        String[] parts = num.split("\\+");

        if(parts[1].contains("i"))
            parts[1] = parts[1].replace("i","");
        else
            throw new Exception("No Complex Number");

        a = Double.parseDouble(parts[0]);
        b = Double.parseDouble(parts[1]);
    }

    public ComplexNumber(double a,double b){
        this.a = a;
        this.b = b;
    }

    public String GetComplexNumber(){
        return a + " + " + b + "i";
    }

    public ComplexNumber sum(ComplexNumber second) {
        return new ComplexNumber(a + second.a, b + second.b);
    }

    public ComplexNumber diff(ComplexNumber second) {
        return new ComplexNumber(a - second.a, b - second.b);
    }

    public ComplexNumber comp(ComplexNumber second) {
        return new ComplexNumber(a * second.a - b * second.b, a * second.b + b * second.a);
    }

    public ComplexNumber divW(ComplexNumber second) {
        double new_a = (a * second.a + b * second.b) / (Math.pow(second.a, 2) + Math.pow(second.b, 2));
        double new_b = (b * second.a - a * second.b) / (Math.pow(second.a, 2) + Math.pow(second.b, 2));
        return new ComplexNumber(new_a, new_b);
    }

}
