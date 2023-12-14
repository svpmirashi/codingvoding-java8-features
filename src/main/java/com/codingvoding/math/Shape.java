package com.codingvoding.math;

import com.codingvoding.client.Circle;

public interface Shape {
    double area();

    default void print() {
        System.out.println("Printing the shape with area: " + area());
    }

    static Circle createCircle(double radius) {
        return new Circle(radius);
    }
}
