package com.company;

public class Polinom {
    private int a;
    private int b;
    private int c;
    private String X1="X^2";
    private String X2="X";

    public Polinom(int a, int b, int c) {
        this.a = a;
        String X1="X^2";
        this.b = b;
        String X2="X";
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public String getX1() {
        return X1;
    }

    public String getX2() {
        return X2;
    }

    public String toString() {
        return a+X1 + "+"+b+X2+ "+"+c;
    }
}
