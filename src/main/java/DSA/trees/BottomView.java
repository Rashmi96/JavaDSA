package DSA.trees;

import java.lang.*;
import java.util.*;

class BottomView{

    static class Node{
        int key;
        Node left, right;

        public Node(int item){
            key = item;
            left = right = null;
        }
    }

    private static void printBottomView(Node root) {
        TreeMap<Integer,int[]> m = new TreeMap<>();
        printBottomView(root,0,0,m);
        for(int[] b : m.values()){
            System.out.println(b[0]);
        }
    }

    private static void printBottomView(Node root, int hd, int curr, TreeMap<Integer, int[]> m) {
        if(root == null){
            return;
        }

        if(!m.containsKey(hd)){
            m.put(hd,new int[]{root.key, curr});
        }
        else{
            int[] a = m.get(hd);
            if(a[1] <= curr){
                a[0] = root.key;
                a[1] = curr;
            }
            m.put(hd,a);
        }

        printBottomView(root.left,hd-1,curr+1,m);

        printBottomView(root.right,hd+1,curr+1,m);
    }

    // Driver Code
    public static void main(String[] args)
    {
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(22);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(25);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);

        System.out.println(
                "Bottom view of the given binary tree:");

        printBottomView(root);
    }

}