package com.HomeWorks2;

public class Shape {
    private int area,perimeter;
    private String name;

    public Shape(int area, int perimeter, String name) {
        this.area = area;
        this.perimeter = perimeter;
        this.name = name;
        printname();
    }

    public int getArea() {
        return this.area;
    }

    public int getPerimeter() {
        return this.perimeter;
    }


    public String getName() {
        return this.name;
    }

    private void printname(){
        System.out.println(name);
    }

}
