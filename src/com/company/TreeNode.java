package com.company;

public class TreeNode {

    private Point item;
    private TreeNode l;
    private TreeNode r;

    public TreeNode(){
        
    }

    public TreeNode(Point item){
        this.item=item;
    }

    public Point getData(){
        return item;
    }

    public void setData(Point item){
        this.item=item;
    }

    public TreeNode getLeft(){
        return l;
    }

    public void setLeft(TreeNode l){
        this.l=l;
    }

    public TreeNode getRight(){
        return r;
    }

    public void setRight(TreeNode r){
        this.r=r;
    }


}
