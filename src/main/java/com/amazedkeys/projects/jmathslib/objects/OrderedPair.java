package com.amazedkeys.projects.jmathslib.objects;

import com.amazedkeys.projects.jmathslib.Operable;

public class OrderedPair implements Operable<OrderedPair> {
    // Attributes
    protected double x, y, magnitude = 0;

    // Constructors
    public OrderedPair() {}
    public OrderedPair(double x, double y) {
        this.x = x;
        this.y = y;
    }
    private OrderedPair(double x, double y, double magnitude) {
        this.x = x;
        this.y = y;
        this.magnitude = magnitude;
    }

    // Basic Getters and Setters
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double getMagnitude() {
        return magnitude;
    }

    // Some object methods
    public int getQuadrant() {
        if (this.x > 0 && this.y > 0) {
            return 1;
        } else if (this.x < 0 && this.y > 0) {
            return 2;
        } else if (this.x < 0 && this.y < 0) {
            return 3;
        } else if (this.x > 0 && this.y < 0) {
            return 4;
        } else {
            return 0;
        }
    }

    // Some Extensions
    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }

    // Operable Methods
    protected static double calcMagnitude(OrderedPair a, OrderedPair b) {
        return Math.sqrt(Math.pow((a.x - b.x), 2) + Math.pow((a.y - b.y), 2));
    }

    @Override
    public OrderedPair add(OrderedPair number2) {
        return new OrderedPair(this.x + number2.x, this.y + number2.y);
    }
    @Override
    public OrderedPair subtract(OrderedPair number2) {
        return new OrderedPair(this.x - number2.x, this.y - number2.y, calcMagnitude(this, number2));
    }
    @Override
    public OrderedPair multiply(OrderedPair number2) {
        return new OrderedPair(this.x * number2.x, this.y * number2.y);
    }
    @Override
    public OrderedPair divide(OrderedPair number2) {
        return new OrderedPair(this.x / number2.x, this.y / number2.y);
    }
    @Override
    public OrderedPair modulo(OrderedPair number2) {
        return new OrderedPair(this.x % number2.x, this.y % number2.y);
    }
    @Override
    public OrderedPair power(OrderedPair number2) {
        return new OrderedPair(Math.pow(this.x, number2.x), Math.pow(this.y, number2.y));
    }
    @Override
    public OrderedPair sqrt() {
        return new OrderedPair(Math.sqrt(this.x), Math.sqrt(this.y));
    }
    @Override
    public OrderedPair negate() {
        return new OrderedPair(-this.x, -this.y);
    }

    // Static Methods
    public static OrderedPair add(OrderedPair a, OrderedPair b) {
        return new OrderedPair(a.x + b.x, a.y + b.y);
    }
    public static OrderedPair subtract(OrderedPair a, OrderedPair b) {
        return new OrderedPair(a.x - b.x, a.y - b.y);
    }
    public static OrderedPair multiply(OrderedPair a, OrderedPair b) {
        return new OrderedPair(a.x * b.x, a.y * b.y);
    }
    public static OrderedPair divide(OrderedPair a, OrderedPair b) {
        return new OrderedPair(a.x / b.x, a.y / b.y);
    }
    public static OrderedPair modulo(OrderedPair a, OrderedPair b) {
        return new OrderedPair(a.x % b.x, a.y % b.y);
    }
    public static OrderedPair power(OrderedPair a, OrderedPair b) {
        return new OrderedPair(Math.pow(a.x, b.x), Math.pow(a.y, b.y));
    }
    public static OrderedPair sqrt(OrderedPair a) {
        return new OrderedPair(Math.sqrt(a.x), Math.sqrt(a.y));
    }
    public static OrderedPair negate(OrderedPair a) {
        return new OrderedPair(-a.x, -a.y);
    }

}
