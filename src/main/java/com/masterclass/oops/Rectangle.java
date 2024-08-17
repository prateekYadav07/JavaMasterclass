package com.masterclass.oops;

public class Rectangle extends Shape{

    private int height;
    private int width;

    Rectangle(int x, int y){
        this(x,y,0,0);
    }

    Rectangle(int x, int y, int height, int width){
        super(x,y);
        this.height = height;
        this.width = width;
    }

    @Override
    protected Rectangle clone() throws CloneNotSupportedException {
        return new Rectangle(0,0,height, width);
    }
}
