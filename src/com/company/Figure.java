package com.company;

public abstract class Figure {
    protected float x,y;
    public Figure(float x, float y){
        this.x=x;
        this.y=y;
    }
    abstract float getArea();
    abstract float getPerimeter();
}
