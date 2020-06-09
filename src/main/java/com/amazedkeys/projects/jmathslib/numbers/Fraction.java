package com.amazedkeys.projects.jmathslib.numbers;

import jdk.jfr.Experimental;

@Experimental
public class Fraction extends Number {
    private double numerator, denominator;

    public Fraction(double numerator, double denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public double getValue() {
        return 0;
    }
}
