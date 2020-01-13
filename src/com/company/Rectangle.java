package com.company;

public class Rectangle {
    private int xmin;
    private int ymin;
    private int xmax;
    private int ymax;

    public void Rectangle(int xmi,int ymi, int xma,int yma){
        xmin=xmi;
        ymin=ymi;
        xmax=xma;
        ymax=yma;
    }

    public int xmin(){
        return xmin;
    }
    public int ymin(){
        return ymin;
    }
    public int xmax(){
        return xmax;
    }
    public int ymax(){
        return ymax;
    }

    public boolean contains(Point p){
        if(xmin>=p.x()&&xmax<=p.x()&&ymin>=p.y()&&ymax()<=p.y()){
            return true;
        }else {
            return false;
        }
    }
    public boolean intersects(Rectangle that){
        if (xmin > that.xmin()||xmax > that.xmax){
            return false;
        }

        if (ymin > that.ymin()||ymax > that.ymax){
            return false;
        }
        return true;
    }



}
