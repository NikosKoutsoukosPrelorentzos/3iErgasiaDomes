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
