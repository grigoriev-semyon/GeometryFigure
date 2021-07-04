package com.company;

public class Circle extends Figure implements Moveable{
    protected float radius;
    public Circle(float x, float y, float radius){
        super(x,y);
        this.radius=radius;
    }

    @Override
    float getArea() {
        return (float) (Math.PI*Math.pow(radius,2));
    }

    @Override
    float getPerimeter() {
        return (float) (2*Math.PI*radius);
    }

    @Override
    public void move(float dx, float dy) {
        this.x=this.x+dx;
        this.y=this.y+dy;
    }

    @Override
    public void resize(float koeff) {
        this.radius=koeff*this.radius;
    }

    @Override
    public String toString() {
        return "Circle\n" +
                "Center: " + "(" +Float.toString(x) + ", "+Float.toString(y)+")\n"+"Radius: "+ Float.toString(radius);
    }
}
