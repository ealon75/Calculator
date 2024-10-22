package com.backend;

public class Calculator {
    
    private static final char _PLUS = '+';
    private static final char _MINUS = '-';
    private static final char _MULT = '*';
    private static final char _DIV = '/';
    private static final char _PRE = '%';
    private static final char _POW = '^';
    
    public Calculator(){

    }

    public static double calculate(double firstNumber, double secondNumber, char operator) {
        switch (operator) {
            case _PLUS:
                return firstNumber + secondNumber;
            case _MINUS:
                return firstNumber - secondNumber;
            case _MULT:
                return firstNumber * secondNumber;
            case _DIV:
                return firstNumber / secondNumber;
            case _PRE:
                return firstNumber % secondNumber;
            case _POW:
                return Math.pow(firstNumber, secondNumber);
            default:
                return secondNumber;
        }
    }
}
