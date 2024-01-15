package com.cylinder.inheritance;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width,double length){
        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length){
        if (length < 0) {
            this.length = 0;
        }
        this.length = length;
    }

    public double getWidth(){

        return width;
    }

    public void setWidth(double width){
        if (width < 0) {
            this.width = 0;
        }
        this.width = width;
    }

    public double getArea(){
        return length*width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
