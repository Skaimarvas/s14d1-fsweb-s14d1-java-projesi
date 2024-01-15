package com.cylinder.inheritance;

public class Cuboid extends Rectangle{
    private double height;


    public Cuboid(double width, double length, double height){
        super(width, length);
        setHeight(height);
    }
    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getVolume(){
        return getArea()*height;
    }

    @Override
    public String toString() {
        return "Cuboid{" +
                "height=" + height +
                '}';
    }
}
