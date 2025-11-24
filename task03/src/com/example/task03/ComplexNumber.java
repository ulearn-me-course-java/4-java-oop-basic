package com.example.task03;

/**
 * Класс комплексного числа вида a + bi
 */
public class ComplexNumber {
    // Поля приватные для инкапсуляции
    private final double real;      // Действительная часть
    private final double imaginary; // Мнимая часть

    // 1. Конструктор для инициализации
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Геттеры (на случай, если понадобятся)
    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    // 2. Сложение комплексных чисел
    // Возвращает НОВЫЙ объект, не меняя текущий
    public ComplexNumber add(ComplexNumber other) {
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }

    // 3. Умножение комплексных чисел
    // Формула: (ac - bd) + (ad + bc)i
    public ComplexNumber multiply(ComplexNumber other) {
        double newReal = (this.real * other.real) - (this.imaginary * other.imaginary);
        double newImaginary = (this.real * other.imaginary) + (this.imaginary * other.real);
        return new ComplexNumber(newReal, newImaginary);
    }

    // 4. Строковое представление
    // Логика для красивого вывода знака (3 - 2i вместо 3 + -2i)
    @Override
    public String toString() {
        if (imaginary >= 0) {
            return String.format("%.1f + %.1fi", real, imaginary);
        } else {
            return String.format("%.1f - %.1fi", real, Math.abs(imaginary));
        }
    }
}