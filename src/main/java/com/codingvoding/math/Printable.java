package com.codingvoding.math;

public interface Printable {
    default void print() {
        System.out.println("Printing from printable.");
    }
}
