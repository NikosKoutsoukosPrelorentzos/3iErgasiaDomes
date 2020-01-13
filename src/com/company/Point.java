package com.company;

public class Point {
    private int x;
    private int y;

    public int x(){
        return x;
    }
    public int y(){
        return y;
    }


    public double distanceTo(Point z){
        double d;
        d = Math.sqrt((x-z.x)*(x-z.x)+(y-z.y)*(y-z.y));
        return d;
    }

    public int squareDistanceTo(Point z){
        return (int) (distanceTo(z)*distanceTo(z));
    }

    public String toString(){
        return "(" + x +"," + y + ")" ;
    }
}
