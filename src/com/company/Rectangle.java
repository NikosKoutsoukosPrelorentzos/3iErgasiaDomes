package com.company;

public class Rectangle{
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
        if(xmin>=p.x()&&xmax<=p.x()&&ymin>=p.y()&&ymax<=p.y()){
            return true;
        }
            return false;
    }
    public boolean intersects(Rectangle that){
        if (xmin > that.xmin||xmax > that.xmax){
            return false;
        }

        if (ymin > that.ymin||ymax > that.ymax){
            return false;
        }
        return true;
    }

    public double distanceToRectangle(Point p){
        if(p.x()>=xmax && p.y()>=ymax){
            return Math.sqrt((p.x()-xmax)^2 + (p.y()-ymax)^2);
        }
        if(p.x()<=xmin && p.y()>=xmax){
            return Math.sqrt((p.x()-xmin)^2 + (p.y()-ymax)^2);
        }
        if(p.x()<=xmin && p.y()<=ymin){
            return Math.sqrt((p.x()-xmin)^2 + (p.y()-ymin)^2);
        }
        if(p.x()>=xmax && p.y()<= ymin){
            return Math.sqrt((p.x()-xmax)^2 + (p.y()-ymin)^2);
        }
        if(p.x()>xmax && p.y()>ymin && p.y()<xmax){
            return Math.sqrt(((p.x()-xmax)^2 + (p.y()-ymax)^2)-(((-((p.x()-xmax)^2 + (p.y()-ymin)^2))+((p.x()-xmax)^2 + (p.y()-ymax)^2)+(ymax-ymin)^2)/2*(ymax-ymin))^2);
        }
        return 0;
    }


















}
