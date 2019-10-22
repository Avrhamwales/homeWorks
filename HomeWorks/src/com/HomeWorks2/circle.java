package com.HomeWorks2;

public class circle extends Shape {
    public circle(int radius, String name) {
        super((int) (radius*radius+Math.PI), (int) (radius*Math.PI), name);
    }
}
