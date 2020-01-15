package com.company;

import java.sql.SQLOutput;

public class TwoDTree {

    private class TreeNode {

        private Point item;
        private TreeNode l;
        private TreeNode r;

        public TreeNode(Point item){
            this.item=item;
        }

        public Point getData(){
            return item;
        }
    }



    public TreeNode head;

    public TreeNode getHead(){
        return head;
    }



    public TwoDTree(){

        head = null;
    }

    public boolean isEmpty(){
        return true;
    }

    public int size(){
        return 0;
    }




    public void insert (Point p){
        head = insertRec(head, p, 0);
      //  System.out.println(head.l.getData().x());
    }



     TreeNode insertRec(TreeNode head,Point p,int LorR){
        if(head == null){
            head = new TreeNode(p);
            return head;
        }
         if(p.x() == head.getData().x() && p.y() == head.getData().y()){
             //System.out.println("We have point " + p.toString() + "inside our tree!!!");
             return head;
         }
        if(p.x() < head.getData().x() && LorR==0){
            head.l = insertRec(head.l,p,1);
        }
        if (p.x() >= head.getData().x() && LorR==0){
            head.r = insertRec(head.r,p,1);
        }
        if (p.y() < head.getData().y() && LorR == 1){
            head.l = insertRec(head.l,p,0);
        }
        if (p.y() >= head.getData().y() && LorR == 1){
            head.r = insertRec(head.r,p,0);
        }
        return head;
    }














    public boolean search(Point p){
        return searchRec(head, p, 0);
    }


    boolean searchRec(TreeNode head,Point p,int LorR){
        if(head == null){
           // head = new TreeNode(p);
            return false;
        }
        if(p.x() == head.getData().x() && p.y() == head.getData().y()){
            //System.out.println("We have point " + p.toString() + "inside our tree!!!");
            return true;
        }
        if(p.x() < head.getData().x() && LorR==0){
           return searchRec(head.l,p,1);
        }
        if (p.x() >= head.getData().x() && LorR==0){
           return searchRec(head.r,p,1);
        }
        if (p.y() < head.getData().y() && LorR == 1){
            return searchRec(head.l,p,0);
        }
        if (p.y() >= head.getData().y() && LorR == 1){
            return searchRec(head.r,p,0);
        }
        return false;
    }




    public Point nearestNeighbor(Point p){
        nearestNeighborRec(head,p,999999999);

        return closest;
    }

    Point closest = new Point();

    void nearestNeighborRec(TreeNode node, Point p,double min){
        if (node == null){

            return;
        }
        double distance = node.getData().distanceTo(p);

        if(distance<min){
            min=distance;
            closest.set(node.getData().x(),node.getData().y());
        }

        nearestNeighborRec(node.r, p , min);
        nearestNeighborRec(node.l, p , min);

        //nearestNeighborRec(node.r, p , min);

       // System.out.println(closest.toString());
        //System.out.println(min);

    }










    void printPostorder(TreeNode node)
    {
        if (node == null) {
            return;
        }
        // first recur on left subtree
        printPostorder(node.l);

        // then recur on right subtree
        printPostorder(node.r);

        // now deal with the node
        System.out.print("("+node.getData().x() + "," + node.getData().y()+")");
    }
}
