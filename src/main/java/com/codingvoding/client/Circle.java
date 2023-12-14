package com.codingvoding.client;

import com.codingvoding.math.Shape;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        final double PI = 3.14;
        return PI * radius * radius;
    }
}
