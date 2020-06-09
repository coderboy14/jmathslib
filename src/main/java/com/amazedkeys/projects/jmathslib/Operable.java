package com.amazedkeys.projects.jmathslib;

public interface Operable<Type> {
    //===============| Object Operations |===============//
    // Unary Operations
    public Type sqrt();
    public Type negate();

    // Binary Operations
    public Type add(Type number2);
    public Type subtract(Type number2);
    public Type multiply(Type number2);
    public Type divide(Type number2);
    public Type modulo(Type number2);
    public Type power(Type number2);
}
