package com.example.task03;

public class ComplexNumber {
    float RealParth;
    float ImaginaryParth;

    public ComplexNumber(float realParth, float imaginaryParth){
        RealParth = realParth;
        ImaginaryParth = imaginaryParth;
    }
    static ComplexNumber Add (ComplexNumber num1, ComplexNumber num2){
        return new ComplexNumber(num1.RealParth + num2.RealParth, num1.ImaginaryParth + num2.ImaginaryParth);
    }

    static ComplexNumber Multiplue (ComplexNumber num1, ComplexNumber num2){
        return new ComplexNumber(num1.RealParth * num2.RealParth - num1.ImaginaryParth * num2.ImaginaryParth, num1.RealParth * num2.ImaginaryParth + num2.RealParth * num1.ImaginaryParth);
    }
    static String ToString(ComplexNumber num){
        if (num.RealParth != 0){
            if (num.ImaginaryParth != 0){
                if (num.ImaginaryParth >= 0){
                    return num.RealParth + "+" + num.ImaginaryParth + "i";
                }
                return num.RealParth + "" + num.ImaginaryParth + "i";
            }
            return num.RealParth + "";
        }
        else  if (num.ImaginaryParth != 0){
            if (num.ImaginaryParth >= 0){
                return num.ImaginaryParth + "i";
            }
            return num.ImaginaryParth + "i";
        }
        else {
            return "0";
        }
    }
}
