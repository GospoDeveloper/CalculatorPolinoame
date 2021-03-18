package com.company;

public class Calculator {

    public Calculator() {
    }
    public String CalculatorPolinom(Polinom polinom, Polinom polinom1) {
        int coef1= polinom.getA() + polinom1.getA();
        int coef2 = polinom.getB() + polinom1.getB();
        int coef3 = polinom.getC() + polinom1.getC();
        return coef1+polinom.getX1()+ "+"+coef2+polinom.getX2()+"+"+coef3;
    }
}
