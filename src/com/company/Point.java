package com.company;

public class Point {

    private int x;
    private int y;

    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }


    public int x(){
        return x;
    }
    public int y(){
        return y;
    }


    public double distanceTo(Point z){
        return Math.sqrt((z.x-x)*(z.x-x) + (z.y-y)*(z.y-y));
    }

    public int squareDistanceTo(Point z)
    {
        return (int) Math.pow(distanceTo(z),2);
    }

    public String toString(){
        return "(" + x +"," + y + ")" ;
    }
}
