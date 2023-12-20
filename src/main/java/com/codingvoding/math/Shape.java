package com.codingvoding.math;

import com.codingvoding.client.Circle;
import com.codingvoding.client.ColoredCircle;

public interface Shape {
    double area();

    default void print() {
        System.out.println("Printing the shape with area: " + area());
    }

    static Circle createCircle(double radius) {
        return new Circle(radius);
    }

    static ColoredCircle createColoredCircle(double radius, String color) {
        return new ColoredCircle(radius, color);
    }
}
