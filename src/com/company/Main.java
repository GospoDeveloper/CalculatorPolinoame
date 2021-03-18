package com.company;

public class Main {

    public static void main(String[] args) {
    Polinom polinom = new Polinom(2, 3, 4);
    Polinom polinom1=new Polinom(3, 4, 2);
    System.out.println(polinom);
    Calculator calculator = new Calculator();
    System.out.println(calculator.CalculatorPolinom(polinom, polinom1));
    }
}
