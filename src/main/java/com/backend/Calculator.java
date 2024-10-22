package com.backend;

public class Calculator {
    
    final char _PLUS = '+';
    final char _MINUS = '-';
    
    public Calculator(){

    }

    public double calculate(double firstNumber, double secondNumber, char operator) {
        switch (operator) {
            case _PLUS:
                return firstNumber + secondNumber;
            case _MINUS:
                return firstNumber - secondNumber;
            case '*':
                return firstNumber * secondNumber;
            case '/':
                return firstNumber / secondNumber;
            case '%':
                return firstNumber % secondNumber;
            case '^':
                return Math.pow(firstNumber, secondNumber);
            default:
                return secondNumber;
        }
    }
}
