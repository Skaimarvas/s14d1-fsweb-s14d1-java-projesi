package com.cylinder.inheritance;

import com.cylinder.inheritance.Circle;

public class Cylinder extends Circle {

    private double height;
    public Cylinder(double radius, double height){
        super(radius);
        setHeight(height);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if ( height < 0) {
            this.height = 0;
        }
        this.height = height;
    }
    public double getVolume(){
        return height * getArea();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}';
    }
}
