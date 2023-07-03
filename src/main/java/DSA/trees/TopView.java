package DSA.trees;

import java.util.TreeMap;

public class TopView {
    static class Node{
        int key;
        Node left, right;

        public Node(int item){
            key = item;
            left = right = null;
        }
    }

    private static void printTopView(Node root) {

        // Map to store Horizontal Distance,
        // Height and Data.
        TreeMap<Integer,int[]> m = new TreeMap<>();
        printTopView(root,0,0,m);

        // Prints the values stored by printBottomViewUtil()
        for(int[] b: m.values()){
            System.out.println(b[0]);
        }
    }

    private static void printTopView(Node root, int hd, int curr, TreeMap<Integer,int[]> m) {
        if(root == null)
            return;

        // If node for a particular
        // horizontal distance is not
        // present, add to the map.
        if(!m.containsKey(hd)){
            m.put(hd,new int[] {root.key,curr});
        }

        // Compare height for already
        // present node at similar horizontal
        // distance
        else{
            int[] a = m.get(hd);
            if(a[1] >= curr){
                a[0] = root.key;
                a[1] = curr;
            }
            m.put(hd,a);
        }

        // Recur for left subtree
        printTopView(root.left,hd-1,curr+1,m);

        // Recur for right subtree
        printTopView(root.right,hd+1,curr+1,m);
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

        printTopView(root);
    }
}
