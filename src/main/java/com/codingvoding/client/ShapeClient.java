package com.codingvoding.client;

import com.codingvoding.math.Shape;

public class ShapeClient {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println("Area of the circle is " + circle.area());
        circle.print();

        Circle circle1 = Shape.createCircle(10);
        circle1.print();
    }
}
