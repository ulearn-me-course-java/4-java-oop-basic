package com.example.task03;

public class ComplexNumber {
    double ReZ;
    double ImZ;
    public ComplexNumber(String number){
        ReZ = Double.valueOf(number.substring(0,number.indexOf("+")).trim());
        ImZ = Double.valueOf(number.substring(number.indexOf("+")+1,number.indexOf("i")).trim());
    }
    public ComplexNumber(double ReZ, double ImZ){
        this.ReZ = ReZ;
        this.ImZ = ImZ;
    }
    public ComplexNumber Sum(ComplexNumber number){
        return new ComplexNumber(ReZ+ number.ReZ,ImZ+ number.ImZ);
    }
    public ComplexNumber Multiply(ComplexNumber number){
        return new ComplexNumber(ReZ* number.ReZ - ImZ* number.ImZ,ReZ* number.ImZ + ImZ* number.ReZ);
    }
    public String ToString(){
        if (ImZ>=0) return ReZ + " + " + ImZ + "i";
        else return ReZ + " - " + -ImZ + "i";
    }
}
