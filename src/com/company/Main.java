package com.company;

public class Main {

    public static void main(String[] args) {
        Point p =new Point(6,6);

        Rectangle to = new Rectangle(4,3,8,12);

        double a= to.distanceToRectangle(p);
        System.out.println(a);

    }
}
