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
        return Math.sqrt((z.x-x)^2 + (z.y-y)^2);
    }

    public int squareDistanceTo(Point z)
    {
        return (int) Math.pow(distanceTo(z),2);
    }

    public String toString(){
        return "(" + x +"," + y + ")" ;
    }
}
