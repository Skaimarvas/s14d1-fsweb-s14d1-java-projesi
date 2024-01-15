package com.cylinder.inheritance;

public class Circle {
    private double radius;
    public Circle(double radius){
           setRadius(radius);
    }
    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return Math.pow(radius,2)*Math.PI;
    }
    public void setRadius(double radius) {
        if (radius < 0) {
            this.radius = 0;
        }
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}