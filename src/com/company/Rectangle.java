package com.company;

public class Rectangle{
    private int xmin;
    private int ymin;
    private int xmax;
    private int ymax;

    public Rectangle(int xmi,int ymi, int xma,int yma){
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
        if(xmin<=p.x() && xmax>=p.x() && ymin<=p.y() && ymax>=p.y()){
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
            return Math.sqrt((p.x()-xmax)*(p.x()-xmax) + (p.y()-ymax)*(p.y()-ymax));
        }
        if(p.x()<=xmin && p.y()>=xmax){
            return Math.sqrt((p.x()-xmin)*(p.x()-xmin) + (p.y()-ymax)*(p.y()-ymax));
        }
        if(p.x()<=xmin && p.y()<=ymin){
            return Math.sqrt((p.x()-xmin)*(p.x()-xmin) + (p.y()-ymin)*(p.y()-ymin));
        }
        if(p.x()>=xmax && p.y()<= ymin){
            return Math.sqrt((p.x()-xmax)*(p.x()-xmax) + (p.y()-ymin)*(p.y()-ymin));
        }
        if(p.x()>xmax && p.y()>ymin && p.y()<xmax){
            return p.x()-xmax;
        }
        if(p.y()>ymax && p.x()>xmin && p.x()<xmax){
            return p.y()-ymax;
        }
        if (p.x()<xmin && p.y()>ymin && p.y()<xmax){
            return xmin - p.x();
        }
        if(p.y()<ymin && p.x()>xmin && p.x()<xmax){
            return ymin - p.y();
        }
        if(contains(p)){
            return 0;
        }
        return 1;
    }

    public int squaredistanceToRectangle(Point p){
        return (int) Math.sqrt(distanceToRectangle(p));
    }
    public String toString(){
        return "["+ xmin + "," + xmax + "] x [" + ymin + "," + ymax +"]";
    }
}
