package com.example.task03;

import org.jetbrains.annotations.NotNull;

public class ComplexNumber {
    public final double Real, Imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.Imaginary = imaginary;
        this.Real = real;
    }

    public ComplexNumber Add(@NotNull ComplexNumber term) {
        return new ComplexNumber(Real + term.Real, Imaginary + term.Imaginary);
    }

    public ComplexNumber Multiply(@NotNull ComplexNumber term) {
        return new ComplexNumber(Real * term.Real - Imaginary * term.Imaginary,
                Real * term.Imaginary + Imaginary * term.Real);
    }
}
