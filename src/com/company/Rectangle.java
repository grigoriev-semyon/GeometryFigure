package com.company;

public class Rectangle extends Figure implements Moveable{
    protected float height;
    protected float width;
    public Rectangle(float x, float y, float height, float width){
        super(x,y);
        this.height=height;
        this.width=width;
    }
    @Override
    float getArea() {
        return height*width;
    }

    @Override
    float getPerimeter() {
        return 2*height+2*width;
    }

    @Override
    public void move(float dx, float dy) {
        this.x=this.x+dx;
        this.y=this.y+dy;
    }

    @Override
    public void resize(float koeff) {
        this.width=koeff*this.width;
        this.height=koeff*this.height;
    }

    @Override
    public String toString() {
        return "Rectangle\n" +
                "Center: " + "(" + (x+width/2) + ", "+ (y+height/2) +")\n" +
                "Height: " + height +"\n"+"Width: "+ width;
    }
}
