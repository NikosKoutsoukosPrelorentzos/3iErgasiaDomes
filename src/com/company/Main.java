package com.company;

public class Main {

    public static void main(String[] args) {
        /*Point p =new Point(6,6);

        Rectangle to = new Rectangle(4,3,8,12);

        double a= to.distanceToRectangle(p);
        System.out.println(a);


         */
        Point x1 = new Point(5,7);
        Point x2 = new Point(7,12);
        Point x3 = new Point(8,5);
        Point x4 = new Point(12,23);
        Point x5 = new Point(34,2);
        Point x6 = new Point(21,4);
        Point x7 = new Point(11,20);





        TwoDTree test = new TwoDTree();

        test.insert(x1);
        test.insert(x2);
        test.insert(x3);
        test.insert(x4);
        test.insert(x5);
        test.insert(x6);
        test.insert(x7);

        test.printPostorder(test.getHead());
    }
}
