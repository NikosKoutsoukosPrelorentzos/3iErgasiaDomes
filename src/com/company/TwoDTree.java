package com.company;

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



    private TreeNode head;

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
         insertRec(head, p, 0);
    }



    int insertRec(TreeNode pop,Point p,int LorR){
        if(head==null){
            // System.out.println("A");
            head = new TreeNode(p);
            return 0;
        }
        if(pop==null){
            // System.out.println("A");
            pop = new TreeNode(p);
            return 1;

        }


        if(p.x() < pop.getData().x() && LorR == 0){
            insertRec(pop.l,p,1);
        }else if (p.x() > pop.getData().x() && LorR == 0){
            insertRec(pop.r,p,1);
        }


        if(p.y()< pop.getData().y() && LorR==1){
            insertRec(pop.r, p,0);
        }else if(p.y()> pop.getData().y() && LorR==1){
            insertRec(pop.r, p,0);
        }


        if (p.x()==pop.getData().x() && p.y()==pop.getData().y()){
            System.out.println("Wrong add. We already hahe this element!");
            return 0;
        }

        return 1;
    }














    public boolean search(Point p){
        return true;
    }
    public Point nearestNeighbor(Point p){
        return p;
    }
    /*public List<Point> rangeSearch(Rectangle rect){

    }

     */




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
